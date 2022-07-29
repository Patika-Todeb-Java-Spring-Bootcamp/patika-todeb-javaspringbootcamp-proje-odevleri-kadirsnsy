package com.todeb.ksensoy.jobsearchsite.model.dto;


import lombok.Data;

import java.util.List;

@Data
public class Resume extends Members {
    private  String gender;
    private  String nationality;
    private  Data birthday;
    private  String drivingLicense;
    private  Boolean militaryService;
    private  WorkExperiences workExperiences;
    private List<String> hobbies;

}