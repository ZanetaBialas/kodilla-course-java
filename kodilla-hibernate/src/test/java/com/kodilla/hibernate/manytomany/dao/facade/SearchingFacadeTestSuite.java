package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.SearchingFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class SearchingFacadeTestSuite {
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    CompanyDao companyDao;

    @Autowired
    SearchingFacade searchingFacade;

    @Test
    public void searchEmployeeTest() {
        //Given
        Employee employee1 = new Employee("Jan", "Kovalsky");
        Employee employee2 = new Employee("Klara", "Biala");

        //When
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        List<Employee> employees = searchingFacade.findEmployee("Biala");

        //Then
        assertFalse(employees.isEmpty());

        //CleanUp
        try {
            employeeDao.delete(employee1);
            employeeDao.delete(employee2);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void searchCompanyTest() {
        //Given
        Company company1 = new Company("Candy pink");
        Company company2 = new Company("Candy litle pink");

        //When
        companyDao.save(company1);
        companyDao.save(company2);
        List<Company> companies = searchingFacade.findCompany("Candy");

        //Then
        assertFalse(companies.isEmpty());

        //CleanUp
        try {
            companyDao.delete(company1);
            companyDao.delete(company2);
        } catch (Exception e) {
            //do nothing
        }
    }
}