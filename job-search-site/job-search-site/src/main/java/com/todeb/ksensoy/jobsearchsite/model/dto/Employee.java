package com.todeb.ksensoy.jobsearchsite.model.dto;

import lombok.Data;

@Data
public class Employee extends Members {
    private  String userName;
    private  String password;
    private Resume resume;

}


