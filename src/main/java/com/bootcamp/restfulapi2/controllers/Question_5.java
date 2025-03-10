package com.bootcamp.restfulapi2.controllers;



import com.bootcamp.restfulapi2.services.UserService;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class Question_5 {
    @Autowired
    UserService service;



    //ques 5
    // A) MimeType Versioning
    @GetMapping(path = "/user", produces="application/vnd.company.app-v1+json")
    public ResponseEntity<List<User>> getUsersYamlV1() {
        return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
    }

    @GetMapping(path = "/user", produces = "application/vnd.company.app-v2+json")
    public ResponseEntity<List<User>> getUsersYamlV2() {
        return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
    }

    // B) Request Parameter versioning
    @GetMapping(path = "/user", params = "version=1")
    public ResponseEntity<List<User>> getUsersParamsV1() {
        return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
    }

    @GetMapping(path = "/user", params = "version=2")
    public ResponseEntity<List<User>> getUsersParamsV2() {
        return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
    }

    // C) URI versioning
    @GetMapping(path = "/v1/user")
    public ResponseEntity<List<User>> getUsersUrlV1() {
        return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
    }

    @GetMapping(path = "/v2/user")
    public ResponseEntity<List<User>> getUsersUrlV2() {
        return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
    }


    // D) Custom Header Versioning
    @GetMapping(path = "/user", headers = "X-API-VERSION=1")
    public ResponseEntity<List<User>> getUsersHeaderV1() {
        return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
    }

    @GetMapping(path = "/user", headers = "X-API-VERSION=2")
    public ResponseEntity<List<User>> getUsersHeaderV2() {
        return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
    }


}