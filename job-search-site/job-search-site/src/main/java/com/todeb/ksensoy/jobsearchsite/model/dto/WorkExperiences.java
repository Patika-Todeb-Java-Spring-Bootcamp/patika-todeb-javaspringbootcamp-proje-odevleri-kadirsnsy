package com.todeb.ksensoy.jobsearchsite.model.dto;


import lombok.Data;

@Data        //İş deneyimleri
public class WorkExperiences extends Members {
    private String taxNumber;
    private String numberOfEmployees;
    private String information;
    private Data dateOfEstablishment;

}

