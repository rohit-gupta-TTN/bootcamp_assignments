package com.bootcamp.jpa2.entities;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "EMPLOYEE_TYPE", discriminatorType = DiscriminatorType.STRING)
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name = "empid")
    private Integer id;

    @Column(name = "empFirstname")
    private String firstName;

    @Column(name = "empLastname")
    private String lastName;

    @Column(name = "empSalary")
    private Integer salary;

    @Column(name = "empAge")
    private Integer age;

    public Employee(Integer age, Integer salary, String lastName, String firstName) {
        this.age = age;
        this.salary = salary;
        this.lastName = lastName;
        this.firstName = firstName;
    }
public Employee(){}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
