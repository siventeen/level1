package com.example.level1.service;

import com.example.level1.mapper.CompanyMapper;
import com.example.level1.entity.Company;
import com.example.level1.entity.CompanyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    @Autowired
    CompanyMapper companyMapper;

    public List<Company> getAllCompany() throws Exception{
        CompanyExample companyExample = new CompanyExample();
        CompanyExample.Criteria criteria = companyExample.createCriteria();
        return companyMapper.selectByExample(companyExample);
    }



}
