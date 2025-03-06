package com.bootcamp.restfulapi1.entity;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Employee {
  @NotNull(message = "id can't be null")
 int id;

    @Size(min = 2, message = "Name should have at least 2 characters")
    String name;

    @Min(value = 18, message = "Age must be at least 18")
    int age;

    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
