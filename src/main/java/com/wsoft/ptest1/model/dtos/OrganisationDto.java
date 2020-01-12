/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsoft.ptest1.model.dtos;

import com.wsoft.ptest1.model.entities.Organisation;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author b.walid
 */
public class OrganisationDto implements Serializable {

    private String name;
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    private List<EmployeeDto> employees;

    public OrganisationDto(Organisation organisation) {
        this.id = organisation.getId();
        this.employees = organisation.getEmployees().stream().map(e -> new EmployeeDto(e)).collect(Collectors.toList());
        this.name = organisation.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmployeeDto> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDto> employees) {
        this.employees = employees;
    }

}
