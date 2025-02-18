//Q.1 Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep
// and join methods in the created threads.

package basics_of_multithreading_1;

class ABC implements Runnable{
int a=9;

    @Override
    public void run() {
for(int i=0;i<10;i++){
    System.out.println(i);
    try {
        Thread.sleep(50);
    }catch (InterruptedException e){

    }
};
    }
}

public class question_1 {
    public static void main(String[] args){
        System.out.println("hello");

        ABC abc=new ABC();
        Thread thread1=new Thread(abc);

        Thread thread2=new Thread(()->{

            System.out.println("thread 2 running");
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("world");
    }
}
