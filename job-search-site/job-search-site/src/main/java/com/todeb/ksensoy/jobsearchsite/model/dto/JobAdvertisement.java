package com.todeb.ksensoy.jobsearchsite.model.dto;

import javax.xml.crypto.Data;

@lombok.Data
public class JobAdvertisement {
    private String city;
    private String district;
    private javax.xml.crypto.Data releaseDate;
    private String sector;
    private String positionLevel;
    private String department;
    private String educationLevel;
    private String position;
    private String experienceDuration;
    private String advertisementLanguage;
    private String jobDescription;
    private Boolean disabilityjobAdvertisement;
}
