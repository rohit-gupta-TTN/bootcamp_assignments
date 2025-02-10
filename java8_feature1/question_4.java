package java8_feature1;

@FunctionalInterface
interface rohit{
    void show();
}
class hello{
    hello(){
        System.out.println("hi,I m constructor");
    }
}
public class question_4 {
    public static void main(String[] args) {
rohit r=hello::new;
        r.show();
    }
}
