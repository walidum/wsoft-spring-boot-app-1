/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsoft.ptest1.services;

import com.wsoft.ptest1.model.Employee;
import com.wsoft.ptest1.repositories.EmployeesRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author b.walid
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeesRepo employeesRepo;

    public List<Employee> getEmployees() {
        return employeesRepo.getEmployees();
    }

    public boolean addEmployee(Employee employee) {
        return employeesRepo.addEmployee(employee);
    }

    public List<Employee> findEmployees(String name) {
        return employeesRepo.findEmployeesByName(name);
    }

}
