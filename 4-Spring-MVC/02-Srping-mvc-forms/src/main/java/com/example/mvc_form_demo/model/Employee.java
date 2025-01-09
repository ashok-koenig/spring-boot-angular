package com.example.mvc_form_demo.model;

public class Employee {
    private String name;
    private String gender;
    private String email;
    private String department;

    public Employee(String name, String gender, String email, String department) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.department = department;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
