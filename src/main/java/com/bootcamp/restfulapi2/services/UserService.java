package com.bootcamp.restfulapi2.services;

import models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public static List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User("1", "Rohit Gupta", 21, "RohitPassw"));
        users.add(new User("2", "Vinay Kumar", 22, "VinayPassw"));
        users.add(new User("3", "Kunal Rawat", 23, "KunalPassw"));
        users.add(new User("4", "Sanchit Arora", 21, "SanchitPass"));
    }


    public void createUser(User user) {
        users.add(user);
    }


    public List<User> getUsers() {
        return users;
    }

    ;

    public User getUserById(String id) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                return u;
            }
        };return null;
    }
    public void deleteUserById(String id) {
        for (User u : users) {
            if (u.getId().equals(id)) {
                users.remove(u);
            }
        };
    }
}




