package com.bootcamp.assignment;

class A {
    void showA() {
        System.out.println("I am A");
    }
}

class B {
    private A a; // direct dependency

    public B() {
        this.a = new A();
    }

    void showB() {
        a.showA();
        System.out.println("I am B");
    }
}

public class Question1 {
    public static void main(String[] args) {
        B b = new B();
        b.showB();
    }
}
