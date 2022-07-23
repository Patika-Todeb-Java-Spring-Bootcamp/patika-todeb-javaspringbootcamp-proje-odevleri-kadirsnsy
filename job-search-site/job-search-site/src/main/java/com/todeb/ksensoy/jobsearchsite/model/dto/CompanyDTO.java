package com.todeb.ksensoy.jobsearchsite.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class CompanyDTO extends Member {
    private  String taxNumber;
    private  String numberOfEmployees;
    private  String information;
    private Date dateOfEstablishment;



}