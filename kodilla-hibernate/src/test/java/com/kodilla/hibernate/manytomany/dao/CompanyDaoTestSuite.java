package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarckson);
        dataMasters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMasters);
        int dataMastersId = dataMasters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMastersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMastersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testCompaniesAndEmployees(){
        //Given
        companyDao.deleteAll();
        employeeDao.deleteAll();

        Employee jack = new Employee("Jack", "With");
        Employee amelia = new Employee("Amelia", "Nowak");
        Employee max = new Employee("Max", "Black");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company greyMatter = new Company("Grey Matter");

        //When
        softwareMachine.getEmployees().add(jack);
        dataMasters.getEmployees().add(amelia);
        greyMatter.getEmployees().add(max);

        companyDao.save(softwareMachine);
        companyDao.save(dataMasters);
        companyDao.save(greyMatter);

        List<Employee> retrieveLastNameOfEmployee = employeeDao.retrieveLastNameOfEmployee("Jack");
        List<Employee> findEmployeeByPartialName = employeeDao.findEmployeeByPartialName("Nowak");

        List<Company> retrievePartialNameOfCompany = companyDao.retrievePartialNameOfCompany("Data Masters");
        List<Company> findCompanyByPartialName = companyDao.findCompanyByPartialName("Software Machine");

        //Then
        assertEquals(0, retrieveLastNameOfEmployee.size());
        assertEquals(0, findEmployeeByPartialName.size());
        assertEquals(1, retrievePartialNameOfCompany.size());
        assertEquals(0, findCompanyByPartialName.size());

        //CleanUp
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }
}
