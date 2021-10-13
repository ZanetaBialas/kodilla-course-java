package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Employee> findEmployee(String fragment) {
        return employeeDao.findEmployeeByPartialName("%" + fragment +"%");
    }

    public List<Company> findCompany(String fragment) {
        return companyDao.findCompanyByPartialName("%" + fragment +"%");
    }
}