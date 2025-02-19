//WAP to return a random integert value from a thread execution using Future.
package basics_of_multithreading_2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class random implements Callable {
    @Override
    public Object call(){
        return (int)(Math.random()*100);
    }
}

public class question_4 {
    public static void main(String[] args) {
        random r=new random();
        ExecutorService exec=new ScheduledThreadPoolExecutor(1);
        try {
            Future<Integer> f=exec.submit(r);
            System.out.println(f.get());
        } catch (Exception e) {
           }finally {
            exec.shutdown();
        }
    }
}
