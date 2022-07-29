package com.todeb.ksensoy.jobsearchsite.model.dto;

import lombok.Data;

@Data
public  abstract class Members {
    private  String name;
    private  String email;
    private  String phone;
    private  String city;
    private  String district;
    private  String address;
}
