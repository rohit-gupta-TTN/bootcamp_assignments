package com.bootcamp.restfulapi1.controllers;

import com.bootcamp.restfulapi1.entity.Employee;
import com.bootcamp.restfulapi1.services.EmployeeService;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class Question8 {
    private EmployeeService employeeService;
    public Question8(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @PutMapping("employees/updateemployee/{id}")
    String updateemployee(@PathVariable int id,@Valid @RequestBody Employee e){
        return employeeService.updateone(id,e);
    }
}
//for Q.10 we have accutator dependency and we information of beans by hitting http://localhost:8080/actuator/beans
