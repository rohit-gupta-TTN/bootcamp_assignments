package com.bootcamp.assignment;

interface C {
    void show();
}

class D implements C {
    @Override
    public void show() {
        System.out.println("Hello, I am D");
    }
}

class E {
    private C c;

    E(C c) {
        this.c = c;
    }

    void display() {
        c.show();
    }
}

public class Question2 {
    public static void main(String[] args) {
        C d = new D();
        E e = new E(d);   //loose coupling
        e.display();
    }
}
