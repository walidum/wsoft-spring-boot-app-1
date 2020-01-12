/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsoft.ptest1.services;

import com.wsoft.ptest1.model.dtos.EmployeeDto;
import com.wsoft.ptest1.model.dtos.OrganisationDto;
import com.wsoft.ptest1.model.entities.Employee;
import com.wsoft.ptest1.model.entities.Organisation;
import com.wsoft.ptest1.repositories.EmployeeRepository;
import com.wsoft.ptest1.repositories.EmployeesRepo;
import com.wsoft.ptest1.repositories.OrganisationRepository;
import java.util.List;
import java.util.stream.Collectors;
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

    @Autowired
    OrganisationRepository organisationRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeDto> getEmployees() {
        List<Employee> list = employeeRepository.findAll();
        return list.stream().map(e -> new EmployeeDto(e)).collect(Collectors.toList());
    }

    public List<OrganisationDto> getOrgs() {
        List<Organisation> list = organisationRepository.findAll();
        List<OrganisationDto> toRturn = list.stream().map(o -> new OrganisationDto(o)).collect(Collectors.toList());
        return toRturn;
    }

    public boolean addEmployee(Employee employee) {
        return employeesRepo.addEmployee(employee);
    }

    public List<Employee> findEmployees(String name) {
        return employeesRepo.findEmployeesByName(name);
    }

}
