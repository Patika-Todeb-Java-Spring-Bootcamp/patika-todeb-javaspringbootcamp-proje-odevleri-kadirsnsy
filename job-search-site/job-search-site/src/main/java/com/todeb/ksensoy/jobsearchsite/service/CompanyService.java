package com.todeb.ksensoy.jobsearchsite.service;

import com.todeb.ksensoy.jobsearchsite.model.entity.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {
    @Autowired
    private  final  CompanyService companyService;

    public List<Company> getAllCompany(){
     //   List<Company> allCompany= companyService.ge
        return  null;
    }


}
