package com.todeb.ksensoy.jobsearchsite.service;

import com.todeb.ksensoy.jobsearchsite.exception.EntityNotFoundException;
import com.todeb.ksensoy.jobsearchsite.model.dto.CompanyDTO;
import com.todeb.ksensoy.jobsearchsite.model.entity.Company;
import com.todeb.ksensoy.jobsearchsite.model.entity.JobAdvertisement;
import com.todeb.ksensoy.jobsearchsite.model.mapper.CompanyMapper;
import com.todeb.ksensoy.jobsearchsite.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyService {


    // 3 ways of Dependency Injection
    // 1 - Field Injection
     //@Autowired
    private  final CompanyRepository companyRepository;

//    @Autowired
//    public CourseService(CourseRepository courseRepository) {
//        this.courseRepository = courseRepository;
//    }

    // 2 - Constructor Injection
//    public CourseService(CourseRepository courseRepository) {
//        this.courseRepository = courseRepository;
//    }

    // 3 - Setter Injection
//    public void setCourseRepository(CourseRepository courseRepository) {
//        this.courseRepository = courseRepository;
//    }
    public List<Company> getAllCompanies() {
        List<Company> allCourses = companyRepository.findAll();
        return allCourses;
    }

    public Company getById(Long id) {
        Optional<Company> byId = companyRepository.findById(id);
        return byId.orElseThrow(() -> new EntityNotFoundException("Company", "id : " + id));
    }

    public Company create(CompanyDTO companyDTO) {
        Company company = CompanyMapper.toEntity(companyDTO);
        return companyRepository.save(company);
    }

    public void delete(Long id) {
        getById(id);
        companyRepository.deleteById(id);
//        getBy vs findBy
//        Course byId = courseRepository.getById(id);
//        Optional<Course> byId1 = courseRepository.findById(id);
    }

    /*public Company update(String name, CompanyDTO course) {
        Optional<Company> courseByTitle = companyRepository.findCompanyByName(name);
        if (!courseByTitle.isPresent())
            throw new EntityNotFoundException("Company", "name : " + name);
//        Course course1 = new Course();
//        course1.setId(courseByTitle.get().getId());
        Company updatedCompany = courseByTitle.get();
        if (!StringUtils.isEmpty(course.getName())) {
            updatedCompany.setName(course.getName());
        }

        return companyRepository.save(updatedCompany);
    }*/

    public List<JobAdvertisement> getAllJobAdvertisement(Long companyId) {
        Company byId = getById(companyId);
        return byId.getJobAdvertisements();
    }

}
