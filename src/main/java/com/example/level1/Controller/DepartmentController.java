package com.example.level1.Controller;

import com.example.level1.entity.Company;
import com.example.level1.entity.Department;
import com.example.level1.result.AjaxResult;
import com.example.level1.service.DepartmentService;
import com.sun.media.sound.AiffFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @CrossOrigin
    @GetMapping(value = "/api/getAllDepartment")
    @ResponseBody
    public AjaxResult getAllDepartment(){
        List<Department> result = null;
        boolean isSuccess = true;
        try {
            result = departmentService.getAllDepartment();
        } catch (Exception e) {
            isSuccess = false;
            System.out.println("查询所有部门失败");
            e.printStackTrace();
        }
        if (isSuccess){
            return AjaxResult.success(result);
        }
        else {
            return AjaxResult.error("查询所有部门失败");
        }
    }

    @CrossOrigin
    @GetMapping(value = "/api/getDepartmentByName")
    @ResponseBody
    public AjaxResult getDepartmentByName(@RequestParam String name){
        List<Department> result = null;
        boolean isSuccess = true;
        try {
            result = departmentService.getDepartmentByName(name);
        } catch (Exception e) {
            isSuccess = false;
            System.out.println("查询部门失败");
            e.printStackTrace();
        }
        if (isSuccess){
            return AjaxResult.success(result);
        }
        else {
            return AjaxResult.error("查询部门失败");
        }
    }

    @CrossOrigin
    @PostMapping(value = "/api/addDepartment")
    @ResponseBody
    public AjaxResult addDepartment (@RequestBody Department department) {
        boolean isSuccess = true;
        String msg = "添加部门成功！";

        try {
            departmentService.addDepartment(department);
        } catch (Exception e) {
            msg = e.getMessage();
            isSuccess = false;
        }
        if (isSuccess){
            return AjaxResult.success(msg);
        }
        else {
            return AjaxResult.error(msg);
        }
    }

    @CrossOrigin
    @DeleteMapping(value = "/api/deleteDepartment")
    @ResponseBody
    public AjaxResult deleteDepartment (@RequestBody List<Department> departments){
        boolean isSuccess = true;
        String msg = "删除部门成功！";

        try {
            departmentService.deleteDepartment(departments);
        } catch (Exception e) {
            msg = e.getMessage();
            isSuccess = false;
        }
        if (isSuccess){
            return AjaxResult.success(msg);
        }else {
            return AjaxResult.error(msg);
        }
    }

    @CrossOrigin
    @PutMapping(value = "/api/updateDepartment")
    @ResponseBody
    public AjaxResult updateDepartment(@RequestBody Department department){
        boolean isSuccess = true;
        String msg = "更新部门成功！";
        try {
            departmentService.updateDepartment(department);
        } catch (Exception e) {
            msg = e.getMessage();
            isSuccess = false;
        }
        if (isSuccess){
            return AjaxResult.success(msg);
        }else {
            return AjaxResult.error(msg);
        }
    }


}
