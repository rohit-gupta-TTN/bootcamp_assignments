package com.bootcamp.assignment;

import org.springframework.stereotype.Component;

@Component
public class Bean {
     String name = "Test Bean";


    @Override
    public String toString() {
        return "I am a bean.";


    }
}