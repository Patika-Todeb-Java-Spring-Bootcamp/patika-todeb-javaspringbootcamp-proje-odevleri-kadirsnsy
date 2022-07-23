package com.todeb.ksensoy.jobsearchsite.model.dto;

import lombok.Data;

@Data
public class Employee extends Member {
    private  String userName;
    private  String password;
    private Resume resume;

}


