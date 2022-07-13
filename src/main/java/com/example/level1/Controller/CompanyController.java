package com.example.level1.Controller;

import com.example.level1.entity.Company;
import com.example.level1.result.AjaxResult;
import com.example.level1.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @CrossOrigin
    @GetMapping(value = "/api/getAllCompany")
    @ResponseBody
    public AjaxResult getAllCompany(){
        List<Company> result = null;
        boolean isSuccess = true;
        try {
            result = companyService.getAllCompany();
        } catch (Exception e) {
            isSuccess = false;
            System.out.println("查询所有公司失败");
            e.printStackTrace();
        }
        if (isSuccess){
            return AjaxResult.success(result);
        }
        else {
            return AjaxResult.error("查询所有公司失败");
        }
    }

    @CrossOrigin
    @GetMapping(value = "/api/getCompanyByName")
    @ResponseBody
    public AjaxResult getCompanyByName(@RequestParam String name){
        List<Company> result = null;
        boolean isSuccess = true;
        try {
            result = companyService.getCompanyByName(name);
        } catch (Exception e) {
            isSuccess = false;
            System.out.println("查询公司失败");
            e.printStackTrace();
        }
        if (isSuccess){
            if (result.isEmpty()){
                return AjaxResult.error("无该公司");
            }
            return AjaxResult.success(result);
        }
        else {
            return AjaxResult.error("查询公司失败");
        }
    }

    @CrossOrigin
    @PostMapping(value = "/api/addCompany")
    @ResponseBody
    public AjaxResult addCompany (@RequestBody Company company) {
        boolean isSuccess = true;
        String msg = "添加公司成功！";

        try {
            companyService.addCompany(company);
        } catch (Exception e) {
            msg = e.getMessage();
            isSuccess = false;
        }
        if (isSuccess){
            return  AjaxResult.success(msg);
        }
        else {
            return AjaxResult.error(msg);
        }
    }

    @CrossOrigin
    @DeleteMapping(value = "/api/deleteCompanies")
    @ResponseBody
    public AjaxResult deleteCompanies(@RequestBody List<Company> companies){
        boolean isSuccess = true;
        String msg = "删除公司成功！";

        try {
            companyService.deleteCompanies(companies);
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
    @PutMapping(value = "/api/updateCompany")
    @ResponseBody
    public AjaxResult updateCompany(@RequestBody Company company){
        boolean isSuccess = true;
        String msg = "更新公司成功！";
        try {
            companyService.updateCompany(company);
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
