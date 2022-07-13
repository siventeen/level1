package com.example.level1.service;

import com.example.level1.mapper.CompanyMapper;
import com.example.level1.entity.Company;
import com.example.level1.entity.CompanyExample;
import jdk.nashorn.internal.objects.NativeUint8Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    CompanyMapper companyMapper;

    @Autowired
    DepartmentService departmentService;

    public List<Company> getAllCompany() throws Exception{
        CompanyExample companyExample = new CompanyExample();
        CompanyExample.Criteria criteria = companyExample.createCriteria();
        return companyMapper.selectByExample(companyExample);
    }

    public List<Company> getCompanyByName(String name) throws Exception{
        CompanyExample companyExample = new CompanyExample();
        CompanyExample.Criteria criteria = companyExample.createCriteria();
        criteria.andNameEqualTo(name);
        return companyMapper.selectByExample(companyExample);
    }
    public void addCompany(Company company) throws Exception{
        CompanyExample companyExample = new CompanyExample();
        CompanyExample.Criteria criteria = companyExample.createCriteria();
        String name = company.getName();
        if (name != null){
            criteria.andNameEqualTo(name);
            List<Company> same_comp = companyMapper.selectByExample(companyExample);
            if (!same_comp.isEmpty()){
                throw new Exception("添加失败，已存在同名公司！");
            }
            else {
                companyMapper.insertSelective(company);
            }
        }else {
            throw new Exception("公司名不能为空");
        }
    }

    public void deleteCompanies (List<Company> companies) throws Exception{
        for (Company company:companies){
            if (company.getId()!= null){
                companyMapper.deleteByPrimaryKey(company.getId());
                departmentService.deleteDepartmentByCompany(company.getId());
            }
            else {
                throw new Exception("删除失败，id不能为空");
            }
        }
    }

    public void updateCompany(Company company) throws Exception{
        if (company.getId()!=null){
            CompanyExample companyExample = new CompanyExample();
            CompanyExample.Criteria criteria = companyExample.createCriteria();
            criteria.andIdEqualTo(company.getId());
            List<Company> sameIdCompany = companyMapper.selectByExample(companyExample);
            if (sameIdCompany.isEmpty()){
                throw new Exception("更新失败，无此id");
            }
            else {
                CompanyExample companyExample1 = new CompanyExample();
                CompanyExample.Criteria criteria1 = companyExample1.createCriteria();
                criteria1.andNameEqualTo(company.getName());
                List<Company> sameNameCompany = companyMapper.selectByExample(companyExample1);
                if (sameNameCompany.isEmpty()){
                    companyMapper.updateByPrimaryKeySelective(company);
                }
                else {
                    throw new Exception("更新失败，已存在此公司名");
                }
            }
        }
        else {
            throw new Exception("更新失败，id不能为空");
        }
    }
}
