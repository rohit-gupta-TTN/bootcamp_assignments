package com.bootcamp.restfulapi2.controllers;

import com.bootcamp.restfulapi2.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import models.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class Question_2 {
    private UserService service;

    public Question_2(UserService service) {
        this.service = service;
    }

    // POST Method : this accepts XML Input
    // will create user with password
    @PostMapping(path = "/user",consumes = MediaType.APPLICATION_XML_VALUE)
    @Operation(summary = "Save the user", description = "Creates a new user and saves it in the system.")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        service.createUser(user);
        return new ResponseEntity<>("User created successfully!", HttpStatus.CREATED);
    }

    // GET Method : this returns XML Response
    // will not give password as we used @JsonIgnore
    @GetMapping(path = "/users", produces = MediaType.APPLICATION_XML_VALUE)
    @Operation(summary = "Get list of users", description = "Fetches all users stored in the system.")
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
    }}
