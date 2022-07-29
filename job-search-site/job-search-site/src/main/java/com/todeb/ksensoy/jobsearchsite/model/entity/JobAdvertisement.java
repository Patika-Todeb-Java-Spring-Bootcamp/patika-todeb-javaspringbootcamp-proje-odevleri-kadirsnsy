package com.todeb.ksensoy.jobsearchsite.model.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "jobAdvertisement")
public class JobAdvertisement {

    @Id
    private Long id;
    private String city;
    private String district;
    private Date releaseDate;
    private String sector;
    private String positionLevel;
    private String department;
    private String educationLevel;
    private String position;
    private String experienceDuration;
    private String advertisementLanguage;
    private String jobDescription;
    private Boolean disabilityjobAdvertisement;


    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
            name = "company_jobAdvertisement",
            joinColumns = {
                    @JoinColumn(name = "jobAdvertisement_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "company_id")
            }
    )
    private List<Company> companies;


}
