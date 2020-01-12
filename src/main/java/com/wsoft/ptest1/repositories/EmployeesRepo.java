/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsoft.ptest1.repositories;

import com.wsoft.ptest1.model.entities.Employee;
import com.wsoft.ptest1.model.entities.Organisation;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author b.walid
 */
@Component
public class EmployeesRepo implements ApplicationRunner {

    private List<Employee> employees;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    OrganisationRepository organisationRepository;

    public void initEmployees() {
        Organisation organisation = new Organisation("AEPS");
        for (Employee employee : getEmployees()) {
            employee.setOrganisation(organisation);
        }
        organisation.setEmployees(getEmployees());
        organisationRepository.save(organisation);
    }

    private List<Employee> camputeListEmployees() {
        employees = new ArrayList<>();
        employees.add(new Employee("emp1", "fonctions1", 42));
        employees.add(new Employee("emp6", "fonctions7", 24));
        employees.add(new Employee("emp8", "fonctions2", 27));
        employees.add(new Employee("emp5", "fonctions6", 54));
        employees.add(new Employee("emp3", "fonctions1", 29));
        employees.add(new Employee("emp2", "fonctions3", 82));
        return employees;
    }

    public boolean addEmployee(Employee employee) {
        try {
            getEmployees().add(employee);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<Employee> findEmployeesByName(String name) {
        if (name != null && !name.isEmpty()) {
            List<Employee> resultat = getEmployees().stream().filter(e -> Objects.equals(e.getName(), name)).collect(Collectors.toList());
            if (resultat != null && !resultat.isEmpty()) {
                return resultat;
            }
        }
        return null;
    }

    public List<Employee> getEmployees() {
        if (employees == null) {
            camputeListEmployees();
        }
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        initEmployees();
    }

}
