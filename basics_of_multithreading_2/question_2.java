//Improve the code written in Basics of Multi Threading Part 1 exercise question 4 to handle the
// deadlock using reentract lock.

package basics_of_multithreading_2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class question_2 {
    public static void main(String[] args) {
        Object resource1 = new Object();
        Object resource2 = new Object();
        Lock lock1=new ReentrantLock();

        Thread t1 = new Thread(() -> {
            lock1.lock() ;
            synchronized (resource1) {
                System.out.println("Utilizing Resource 1 in " + Thread.currentThread().getName());
                System.out.println("Waiting for resource 2 in " + Thread.currentThread().getName());
                synchronized (resource2) {
                    System.out.println("utilizing Resource 2 in " + Thread.currentThread().getName());
                }
            }
            lock1.unlock();

        });
        t1.setName("t1");

        Thread t2 = new Thread(() -> {
            lock1.lock() ;
            synchronized (resource2) {
                System.out.println("Utilizing Resource 2 in " + Thread.currentThread().getName());
                System.out.println("Waiting for resource 1 in " + Thread.currentThread().getName());
                synchronized (resource1) {
                    System.out.println("utilizing Resource 1 in " + Thread.currentThread().getName());
                }
            }
            lock1.unlock();

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