package com.bootcamp.restfulapi2.controllers;

import com.bootcamp.restfulapi2.services.SayHello;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question_1{
    private SayHello service;

    Question_1(SayHello service) {
        this.service = service;
    }

    @GetMapping("/hello/{username}")
    @Operation(summary = "says hello", description = "Prints hello with name.")
    public ResponseEntity<String> sayHello(@PathVariable String username) {
        String message = service.getHello();
        return new ResponseEntity<>(message + " " + username, HttpStatus.OK);
    }
}
