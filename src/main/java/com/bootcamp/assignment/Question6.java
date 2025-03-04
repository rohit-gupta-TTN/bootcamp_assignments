package com.bootcamp.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class TestS{
    private TestP testp;
    TestS(TestP p) {
        this.testp = p;
    }
void hello(){
        testp.hello();
}
}
    public class Question6 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        TestS tests = context.getBean(TestS.class);
        tests.hello();
    }
}