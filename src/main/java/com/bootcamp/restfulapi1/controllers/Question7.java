package com.bootcamp.restfulapi1.controllers;

import com.bootcamp.restfulapi1.services.EmployeeService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

@RestController
public class Question7 {
    private EmployeeService employeeService;
    public Question7(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @DeleteMapping("employees/delemployee")
    String delemployee(@Parameter int id){
        return employeeService.delone(id);
    }



}
