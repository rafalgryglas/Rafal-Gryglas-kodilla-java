package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuerySearcher {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    List<Employee> employeesSearchByLastName(String arg) {
        return employeeDao.findEmployeesByNameFragment(arg);
    }

    List<Company> companiesSearchByCompanyName(String arg) {
        return companyDao.findCompanyByNameFragment(arg);
    }

}
