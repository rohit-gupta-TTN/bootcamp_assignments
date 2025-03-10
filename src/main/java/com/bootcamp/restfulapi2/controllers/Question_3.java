package com.bootcamp.restfulapi2.controllers;

import com.bootcamp.restfulapi2.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question_3 {
    private UserService service;
    Question_3(UserService service){
        this.service=service;
    }
    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Delete the user", description = "Deletes a user.")
    public void deletebyid(@PathVariable String id) {
        service.deleteUserById(id);


    }
}
