/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsoft.ptest1.model.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author b.walid
 */
@Entity(name = "employee")
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String fonction;
    private int age;
    @ManyToOne(fetch = FetchType.LAZY)
    private Organisation organisation;

    public Organisation getOrganisation() {
        return organisation;
    }

    public static Employee copy(Employee employee) {
        return new Employee(employee.getName(), employee.getFonction(), employee.getAge());
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }

    public Employee(String name, String fonction, int age) {
        this.name = name;
        this.fonction = fonction;
        this.age = age;
    }

    public Employee() {
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

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", fonction=" + fonction + ", age=" + age + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
