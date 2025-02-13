//Q.2 Convert an Optional type into Stream

package beyondjava8_features2;

import java.util.Optional;

public class question_2 {
    public static void main(String[] args) {
       Optional<String> str=Optional.of("Hello");
       str.stream().map(s->s.toUpperCase()).forEach(System.out::println);

    }
}
