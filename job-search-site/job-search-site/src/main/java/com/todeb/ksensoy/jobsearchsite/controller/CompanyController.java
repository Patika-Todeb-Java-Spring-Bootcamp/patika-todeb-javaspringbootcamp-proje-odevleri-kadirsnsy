package com.todeb.ksensoy.jobsearchsite.controller;

import com.todeb.ksensoy.jobsearchsite.model.dto.CompanyDTO;
import com.todeb.ksensoy.jobsearchsite.model.entity.Company;
import com.todeb.ksensoy.jobsearchsite.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;


    //@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @GetMapping("/all")
    public ResponseEntity getAllCourses() {
        List<Company> allCompanies = companyService.getAllCompanies();
        return ResponseEntity.ok(allCompanies);
    }

    @PostMapping("/create")
    public ResponseEntity createNewConpany(@RequestBody CompanyDTO company) {
        Company respCompany = companyService.create(company);
        if (respCompany == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Course could not be created successfully");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(respCompany);
    }

}
