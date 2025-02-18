//Q.3WAP to showcase the usage of volatile in java.

package basics_of_multithreading_1;
class Student {
    public volatile int marks = 30;

}

public class question_3 {
    public static void main(String[] args) {
        Student st = new Student();
        Thread t1 = new Thread(() -> {
            while (st.marks == 30) {
                System.out.println("marks are :" + st.marks);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            st.marks = 22;
            System.out.println("marks are :" + st.marks);
        });
        t1.start();
        t2.start();

    }
}
