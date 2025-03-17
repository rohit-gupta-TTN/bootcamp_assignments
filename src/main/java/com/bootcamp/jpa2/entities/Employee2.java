package com.bootcamp.jpa2.entities;


import jakarta.persistence.*;

@Entity
public class Employee2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;
    private int age;

    @Embedded
    private SalaryDetails salaryDetails;

    public Employee2() {}

    public Employee2(String firstName, String lastName, int age, SalaryDetails salaryDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salaryDetails = salaryDetails;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public SalaryDetails getSalaryDetails() { return salaryDetails; }
    public void setSalaryDetails(SalaryDetails salaryDetails) { this.salaryDetails = salaryDetails; }
}