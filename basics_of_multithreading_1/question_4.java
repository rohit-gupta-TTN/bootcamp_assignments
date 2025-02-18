//Q.4 Write a code to simulate a deadlock in java


package basics_of_multithreading_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class question_4 {
    public static void main(String[] args) {
        Object resource1 = new Object();
        Object resource2 = new Object();
        Lock lock1=new ReentrantLock();
        Lock lock2=new ReentrantLock();
        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Utilizing Resource 1 in " + Thread.currentThread().getName());
                System.out.println("Waiting for resource 2 in " + Thread.currentThread().getName());
                synchronized (resource2) {
                    System.out.println("utilizing Resource 2 in " + Thread.currentThread().getName());
                }
            }

        });
        t1.setName("t1");

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Utilizing Resource 2 in " + Thread.currentThread().getName());
                System.out.println("Waiting for resource 1 in " + Thread.currentThread().getName());
                synchronized (resource1) {
                    System.out.println("utilizing Resource 1 in " + Thread.currentThread().getName());
                }
            }
        });

        t2.setName("t2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}