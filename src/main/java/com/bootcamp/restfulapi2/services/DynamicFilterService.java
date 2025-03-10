package com.bootcamp.restfulapi2.services;

import models.DynamicFilterUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DynamicFilterService {
List<DynamicFilterUser> dynamicUsers=new ArrayList<>();

    public DynamicFilterService() {
        dynamicUsers.add(new DynamicFilterUser(1,"Rohit Gupta","RohitPassw"));
        dynamicUsers.add( new DynamicFilterUser(2, "Vinay Kumar", "VinayPassw"));
        dynamicUsers.add( new DynamicFilterUser(3, "Kunal Rawat", "KunalPassw"));
        dynamicUsers.add( new DynamicFilterUser(4, "Sanchit Arora", "SanchitPass"));

    }
    public List<DynamicFilterUser> getUsers() {
        return dynamicUsers;
    }
}
