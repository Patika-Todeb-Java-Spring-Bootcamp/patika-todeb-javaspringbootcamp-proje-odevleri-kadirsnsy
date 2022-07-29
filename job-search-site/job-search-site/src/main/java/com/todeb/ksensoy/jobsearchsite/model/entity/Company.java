package com.todeb.ksensoy.jobsearchsite.model.entity;


import com.todeb.ksensoy.jobsearchsite.model.dto.Members;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "company")
public class Company extends Members {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String taxNumber;
    private  String numberOfEmployees;
    private  String information;
    private Date dateOfEstablishment;

    @ManyToMany(mappedBy = "companies", cascade = CascadeType.MERGE)
    private List<JobAdvertisement> jobAdvertisements;
}
