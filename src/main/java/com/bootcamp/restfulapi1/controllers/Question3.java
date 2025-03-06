package com.bootcamp.restfulapi1.controllers;

import com.bootcamp.restfulapi1.entity.Employee;
import com.bootcamp.restfulapi1.services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Question3 {

    private  EmployeeService employeeService;
    public Question3(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("/employees")
        List<Employee> allEmployees(){
         return employeeService.allEmployees();
        }

}
