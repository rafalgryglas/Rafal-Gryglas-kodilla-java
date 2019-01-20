package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuerriesSearcherTest {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    QuerySearcher querySearcher;

    @Test
    public void employeeSearcherByLastnameFragmentTest() {
        //Given
        Employee employee1 = new Employee("Rafal", "Gryglas");
        Employee employee2 = new Employee("Mateusz", "Dallas");
        Employee employee3 = new Employee("Alicja", "Kowalska");
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);

        //When
        List<Employee> resultList = querySearcher.employeesSearchByLastName("%las%");

        //Then
        Assert.assertEquals(2, resultList.size());
    }

    @Test
    public void companiesSercherByNameFragment() {
        //Given
        Company company1 = new Company("Facada");
        Company company2 = new Company("Factory");
        Company company3 = new Company("Builder");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        //When
        List<Company> resultList = querySearcher.companiesSearchByCompanyName("%de%");
        //Then
        Assert.assertEquals(1, resultList.size());
        Assert.assertEquals("Builder", resultList.get(0).getName());

    }
}
