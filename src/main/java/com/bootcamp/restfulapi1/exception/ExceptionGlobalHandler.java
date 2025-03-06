package com.bootcamp.restfulapi1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class ExceptionGlobalHandler{
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<String> EmployeeNotFoundExceptionHandler(EmployeeNotFoundException e) {
        ResponseEntity<String> r = new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        return r;
    }
}
















