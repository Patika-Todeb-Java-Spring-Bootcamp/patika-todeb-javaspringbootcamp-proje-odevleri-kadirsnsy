package com.todeb.ksensoy.jobsearchsite.model.mapper;

import com.todeb.ksensoy.jobsearchsite.model.dto.CompanyDTO;
import com.todeb.ksensoy.jobsearchsite.model.entity.Company;

public class CompanyMapper {
    public  static  CompanyDTO toDTO(Company company){
        CompanyDTO companyDTO= new CompanyDTO();
        companyDTO.setName(company.getName());
        companyDTO.setPhone(company.getPhone());
        companyDTO.setCity(company.getCity());
        companyDTO.setDistrict(company.getDistrict());
        companyDTO.setAddress(company.getAddress());
        companyDTO.setTaxNumber(company.getTaxNumber());
        companyDTO.setNumberOfEmployees(company.getNumberOfEmployees());
        companyDTO.setInformation(company.getInformation());
        companyDTO.setDateOfEstablishment(company.getDateOfEstablishment());
        return  companyDTO;
    }

    public  static  Company toEntity(CompanyDTO companyDTO){
        Company company= new Company();
        company.setName(companyDTO.getName());
        company.setPhone(companyDTO.getPhone());
        company.setCity(companyDTO.getCity());
        company.setDistrict(companyDTO.getDistrict());
        company.setAddress(companyDTO.getAddress());
        company.setTaxNumber(companyDTO.getTaxNumber());
        company.setNumberOfEmployees(companyDTO.getNumberOfEmployees());
        company.setInformation(companyDTO.getInformation());
        company.setDateOfEstablishment(companyDTO.getDateOfEstablishment());
        return  company;
    }

}
