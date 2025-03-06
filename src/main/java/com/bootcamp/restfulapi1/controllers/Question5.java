package com.bootcamp.restfulapi1.controllers;

import com.bootcamp.restfulapi1.entity.Employee;
import com.bootcamp.restfulapi1.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class Question5 {
    private EmployeeService employeeService;
    public Question5(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @PostMapping("employees/addemployee")
    String allEmployee(@Valid @RequestBody Employee e){
        return employeeService.addone(e);
    }

}
