//WAP to showcase the difference between shutdown() and shutdownNow().
package basics_of_multithreading_2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class monkey implements Runnable{
    private int c=0;
    @Override
    public void run() {
        for(int i=0;i<50000000;i++){
            c++;
        }
        System.out.println("Hi I m a monkey");
    }
}
public class question_5 {

    public static void main(String[] args) {
        ExecutorService exec= Executors.newSingleThreadExecutor();
        monkey m=new monkey();
        monkey m2=new monkey();
        exec.submit(m);
        exec.submit(m2);
 //note:shutdown() will allow execution of all the threads that are submitted before calling shutdown() method.
 //but
        //exec.shutdown();
      System.out.println(exec.shutdownNow());
    }

}
