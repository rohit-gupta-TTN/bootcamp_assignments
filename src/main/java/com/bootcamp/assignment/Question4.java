package com.bootcamp.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Question4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Bean myBean = context.getBean(Bean.class);

        System.out.println("Name: " + myBean.name);
    }
}
