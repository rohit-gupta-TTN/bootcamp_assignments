
//Q.1 Use iterator stream method to generate a stream
package beyondjava8_features2;
import java.util.stream.Stream;

public class question_1 {
    public static void main(String[] args) {


        //iterate with seed , Predicate , Unary operator
        Stream
                .iterate(0, i -> i < 11, i -> i + 1)
                .forEach(System.out::println);


    }
}
