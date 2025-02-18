//Q.2Use Synchronize method and synchronize block to enable synchronization between multiple threads
// trying to access method at same time.

package basics_of_multithreading_1;

class Dosomething{
    int count=0;
     public synchronized void doing(){
        System.out.println("doing something");
        for(int i=0;i<10000;i++){
            count++;
        }
    }
    public void something(){
        System.out.println("something something");
        synchronized (this){for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName());
        }}
    }

}
public class question_2 {
    public static void main(String[] args) {
        System.out.println("synchronised method:");
Dosomething abc=new Dosomething();
Thread thread0=new Thread(()->{
    abc.doing();
});
Thread thread1=new Thread(()->{
    abc.doing();
});
thread0.start();
thread1.start();
try {
    thread0.join();
    thread1.join();
}catch (InterruptedException e) {

}
    System.out.println(abc.count);

        System.out.println("\n \n synchronised block:");
Thread thread2=new Thread(()->{
    abc.something();
});
Thread thread3=new Thread(()->{
    abc.something();
});
thread2.start();
thread3.start();
try {
    thread2.join();
    thread3.join();
}catch (InterruptedException e) {

}

    }
}
