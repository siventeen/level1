package com.example.level1.service;

import com.example.level1.entity.Company;
import com.example.level1.entity.CompanyExample;
import com.example.level1.entity.Department;
import com.example.level1.entity.DepartmentExample;
import com.example.level1.mapper.CompanyMapper;
import com.example.level1.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    CompanyMapper companyMapper;
    public List<Department> getAllDepartment() throws Exception{
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        return departmentMapper.selectByExample(departmentExample);
    }

    public List<Department> getDepartmentByName(String name) throws Exception{
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andNameEqualTo(name);
        return departmentMapper.selectByExample(departmentExample);
    }

    public void addDepartment(Department department) throws Exception{
        if (department.getId()==null || department.getName()==null || department.getCompany_id()==null){
            throw new Exception("添加部门失败");
        }
        String higherDepId = department.getHigher_dep_id();
        String companyId = department.getCompany_id();
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andNameEqualTo(department.getName());
        criteria.andCompany_idEqualTo(companyId);
        List<Department> sameDepartments = departmentMapper.selectByExample(departmentExample); //是否有同名同公司的部门

        if (sameDepartments.isEmpty()){//如果没有同名同公司的部门，先检查上级部门是否为null，再检查部门是否合法
            if (higherDepId == null){
                if (isCompanyLegal(department)){
                    departmentMapper.insertSelective(department);
                }
                else {
                    throw new Exception("添加部门失败，无该公司");
                }
            }
            else {

                if (isHigherDepAndComLegal(department)){
                    departmentMapper.insertSelective(department);
                }
                else {
                    throw new Exception("添加失败，上级部门或公司错误");
                }
            }
        }
        else {//如果有同名同公司的部门，先检查上级部门是否为null，然后是否有相同部门，再检查上级部门是否合法
            if (higherDepId == null){
                for (Department department1 : sameDepartments){
                    if (department1.getHigher_dep_id() == null){
                        throw new Exception("添加失败，已有相同部门");
                    }
                }
                if (isCompanyLegal(department)){
                    departmentMapper.insertSelective(department);
                }
                else {
                    throw new Exception("添加部门失败，无该公司");
                }
            }
            else {
                //有上级部门，先检查是否有相同部门，然后检查上级部门是否合法
                for (Department department1 : sameDepartments){
                    if (higherDepId.equals(department1.getHigher_dep_id())){
                        throw new Exception("添加失败，已有相同部门");
                    }
                }
                if (isHigherDepAndComLegal(department)){
                    departmentMapper.insertSelective(department);
                }
                else {
                    throw new Exception("添加失败，上级部门或公司错误");
                }
            }
        }

    }

    private boolean isHigherDepAndComLegal(Department department) throws Exception {
        //如果上级部门不为空，检查数据库中是否有此上级部门
        //如果有，则检查上级部门所属公司和将要插入部门的所属公司是否一致
        String higherDepId = department.getHigher_dep_id(); String companyId = department.getCompany_id();
        DepartmentExample departmentExample1 = new DepartmentExample();
        DepartmentExample.Criteria criteria1 = departmentExample1.createCriteria();
        criteria1.andIdEqualTo(higherDepId);
        List<Department> HigherDep = departmentMapper.selectByExample(departmentExample1);
        if (HigherDep.isEmpty()){
//            throw new Exception("添加失败，无此上级部门");
            return false;
        }
        else {
            CompanyExample companyExample = new CompanyExample();
            CompanyExample.Criteria criteria = companyExample.createCriteria();
            criteria.andIdEqualTo(companyId);
            List<Company> companies = companyMapper.selectByExample(companyExample);
            if (companies.isEmpty()){
                return false;
            }
            else {
                if (companyId.equals(HigherDep.get(0).getCompany_id())){
//                departmentMapper.insertSelective(department);
                    return true;
                }
                else {
//                throw new Exception("添加失败，所属公司错误");
                    return false;
                }
            }
        }
    }

    private boolean isCompanyLegal(Department department) throws Exception {
        //如果上级部门不为空，检查数据库中是否有此上级部门
        //如果有，则检查上级部门所属公司和将要插入部门的所属公司是否一致
        String companyId = department.getCompany_id();
        CompanyExample companyExample = new CompanyExample();
        CompanyExample.Criteria criteria = companyExample.createCriteria();
        criteria.andIdEqualTo(companyId);
        List<Company> companies = companyMapper.selectByExample(companyExample);
        if (companies.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }

    public void deleteDepartment (List<Department> departments) throws Exception{
        for (Department department : departments){
            if (department.getId()!= null){
                //删除以该部门为上级部门的部门
                DepartmentExample departmentExample = new DepartmentExample();
                DepartmentExample.Criteria criteria = departmentExample.createCriteria();
                criteria.andHigher_dep_idEqualTo(department.getId());
                List<Department> departments1 = departmentMapper.selectByExample(departmentExample);
                //递归删除
                deleteDepartment(departments1);
                companyMapper.deleteByPrimaryKey(department.getId());
            }
            else {
                throw new Exception("删除失败，id不能为空");
            }
        }
    }

    public void deleteDepartmentByCompany (String companyId) throws Exception{
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andCompany_idEqualTo(companyId);
        List<Department> departments = departmentMapper.selectByExample(departmentExample);
        deleteDepartment(departments);
    }

    public void updateDepartment (Department department) throws Exception{
        if (department.getId()==null || department.getName()==null || department.getCompany_id()==null){
            throw new Exception("更新部门失败");
        }

        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andIdEqualTo(department.getId());
        List<Department> sameIdDepartment = departmentMapper.selectByExample(departmentExample);
        if (sameIdDepartment.isEmpty()){
            throw new Exception("更新失败，无此id");
        }
        else {
            if (department.getHigher_dep_id() != null){
                if (!isHigherDepAndComLegal(department)){
                    throw new Exception("更新失败，上级部门或公司错误");
                }
            }
            else {
                if (!isCompanyLegal(department)){
                    throw new Exception("更新失败，无此公司");
                }
            }

            //只能更部门名
            department.setCompany_id(null);
            department.setHigher_dep_id(null);
            departmentMapper.updateByPrimaryKeySelective(department);
        }
    }



}
