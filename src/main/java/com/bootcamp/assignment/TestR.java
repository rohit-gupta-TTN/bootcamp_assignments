package com.bootcamp.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TestR implements TestP{

        @Override
        public void hello() {
            System.out.println("hi,I m R.");
        }

}
