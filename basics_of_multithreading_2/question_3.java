//Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool() to submit a list of tasks
// and wait for completion of all tasks.

package basics_of_multithreading_2;

import java.util.concurrent.*;

class car implements Callable {
    public int id;
    public car(int id) {
    this.id=id;
    };

    @Override
    public Object call() throws Exception {
        String s="Hi I m a callable,my id is "+id;
        return s;
    }
}
public class question_3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Single Thread Executor \n");
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++) {
            car c = new car(i);
           Future<String> f=exec.submit(c);
            System.out.println(f.get());
        }
        exec.shutdown();

        System.out.println("\n new cached thread pool \n");
        ExecutorService exec2 = Executors.newCachedThreadPool();
        for(int i=5;i<10;i++) {
            car c = new car(i);
            Future<String> f=exec2.submit(c);
            System.out.println(f.get());
        }
        exec2.shutdown();

        System.out.println("\n new fixed thread pool \n");
        ExecutorService exec3 = Executors.newFixedThreadPool(2);
        for(int i=10;i<15;i++) {
            car c = new car(i);
            Future<String> f=exec3.submit(c);
            System.out.println(f.get());
        }
        exec3.shutdown();
    }
}
