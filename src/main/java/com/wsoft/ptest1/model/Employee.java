/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wsoft.ptest1.model;

import java.io.Serializable;

/**
 *
 * @author b.walid
 */
public class Employee implements Serializable {

    private String name;
    private String fonction;
    private int age;

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

}
