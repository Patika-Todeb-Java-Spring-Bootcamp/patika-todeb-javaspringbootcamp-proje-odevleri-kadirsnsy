package com.todeb.ksensoy.jobsearchsite.repository;

import com.todeb.ksensoy.jobsearchsite.model.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {

    Optional<Company> findCompanyByName(String name);
    Optional<Company> findCompanyByPhone(String name);
    Optional<Company> findCompanyByTaxNumber(String name);
    List<Company> getAllByCity(String city);
    List<Company> getAllByDistrict(String city);
    List<Company> getAllByPhone(String city);
    List<Company> getAllByCityAndDistrict(String city,String district);

}
