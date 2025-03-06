package com.bootcamp.restfulapi1.controllers;

import com.bootcamp.restfulapi1.entity.Employee;
import com.bootcamp.restfulapi1.exception.EmployeeNotFoundException;
import com.bootcamp.restfulapi1.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question4 {
    private EmployeeService employeeService;
    public Question4(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("employees/{id}")
    Employee findone(@PathVariable int id){
        Employee employee =  employeeService.findone(id);
        return ResponseEntity.ok(employee).getBody();

    }




//    @ExceptionHandler(EmployeeNotFoundException.class)
//    public ResponseEntity<String> handlerEmpployeeNotFoundException(EmployeeNotFoundException e){
//        return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
//    }

}
