package com.bootcamp.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

interface F {
    void show();
}

@Component
class G implements F {
    @Override
    public void show() {
        System.out.println("Hello, I am G");
    }
}

@Component
class H {
    private final F f;

    @Autowired
    public H(F f) {
        this.f = f;
    }

    void display() {
        f.show();
    }
}

@Configuration
@ComponentScan
class AppConfig {}

public class Question3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        H h = context.getBean(H.class);
        h.display();
    }
}

