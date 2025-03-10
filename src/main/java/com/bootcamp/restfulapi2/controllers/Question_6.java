package com.bootcamp.restfulapi2.controllers;

import com.bootcamp.restfulapi2.services.UserService;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question_6 {
    @Autowired
    UserService service;
    @GetMapping(path = "v2/user/{id}")
    public ResponseEntity<EntityModel<User>> getUserById(@PathVariable String id) {
        User user = service.getUserById(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        //wrapping around Entity Model
        EntityModel<User> userEnhancedEntityModel = EntityModel.of(user);
        //creating HATEOAS link to fetch all topics
        Link topicsLink = WebMvcLinkBuilder
                .linkTo(WebMvcLinkBuilder.methodOn(Question_6.class).getAllTopics())
                .withRel("all-topics");

        userEnhancedEntityModel.add(topicsLink);

        return ResponseEntity.ok(userEnhancedEntityModel);
    }
    @GetMapping("/topics")
    public ResponseEntity<String> getAllTopics() {
        return ResponseEntity.ok("List of all topics");
    }

}
