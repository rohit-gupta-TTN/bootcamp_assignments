package com.bootcamp.restfulapi1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question1 {

@GetMapping("/api")
String  hi(){
    return "Welcome to SpringBoot";
}
}
