package com.bootcamp.assignment;

import org.springframework.stereotype.Component;

@Component
public class TestQ implements TestP{
    @Override
    public void hello() {
        System.out.println("hi,I m Q.");
    }

}
