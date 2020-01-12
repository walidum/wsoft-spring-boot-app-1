/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsoft.ptest1.model.dtos;

import com.wsoft.ptest1.model.entities.Employee;
import java.io.Serializable;

/**
 *
 * @author b.walid
 */
public class EmployeeDto implements Serializable {

    private Long id;
    private String name;
    private String fonction;
    private int age;

    public EmployeeDto(Employee employee) {
        this.fonction = employee.getFonction();
        this.age = employee.getAge();
        this.id = employee.getId();
        this.name = employee.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
