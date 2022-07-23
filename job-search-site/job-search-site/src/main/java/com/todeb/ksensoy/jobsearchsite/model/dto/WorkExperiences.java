package com.todeb.ksensoy.jobsearchsite.model.dto;


import lombok.Data;

@Data
public class WorkExperiences extends Member {
    private String taxNumber;
    private String numberOfEmployees;
    private String information;
    private Data dateOfEstablishment;

}

