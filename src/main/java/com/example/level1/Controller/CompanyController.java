package com.example.level1.Controller;

import com.example.level1.entity.Company;
import com.example.level1.result.AjaxResult;
import com.example.level1.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @CrossOrigin
    @GetMapping(path = "/api/getAllCompany")
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
}
