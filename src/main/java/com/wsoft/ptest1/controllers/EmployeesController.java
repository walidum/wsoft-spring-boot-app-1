/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsoft.ptest1.controllers;

import com.wsoft.ptest1.model.Employee;
import com.wsoft.ptest1.services.EmployeeService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author b.walid
 */
@RestController
public class EmployeesController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/hi")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/employees")
    public List<Employee> employees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/findEmployees/{name}")
    public List<Employee> findEmployees(@PathVariable("name") String name) {
        return employeeService.findEmployees(name);
    }

    @PostMapping("/addEmployee")
    public boolean addEmployee(@Valid Employee employee) {
        System.out.println(employee.toString());
        return employeeService.addEmployee(employee);
    }

}
