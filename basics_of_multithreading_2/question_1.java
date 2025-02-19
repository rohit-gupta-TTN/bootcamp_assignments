//WAP to show usage of Callable and demonstrate how it is different from Runnable

package basics_of_multithreading_2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class brand implements Callable{
public String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object call() throws Exception {
       String s="Hi I m a callable,my name is "+name;
        return s;
    }
}

class brand2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Hi I m a runnable");
    }
}
public class question_1 {
    public static void main(String[] args) {
        //Runnable
        Thread t1=new Thread(new brand2());
        t1.start();

        //Callable
        ExecutorService exec=new ScheduledThreadPoolExecutor(1);
        brand b=new brand();
        b.setName("rohit");
        Future<String> f=exec.submit(b);
        try {
            System.out.println(f.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            exec.shutdown();
        }

    }
}
