package java8_feature2;

import java.util.ArrayList;
import java.util.*;

public class question_4 {
    public static void main(String[] args) {

        Optional<String> randomValue = Optional.of("Hello World");
        if(randomValue.isPresent()){
            System.out.println(randomValue.get());
        }
        Optional<String> emptyVlaue = Optional.ofNullable(null);
        System.out.println(emptyVlaue.orElse("Default Value"));
        emptyVlaue = Optional.of("Hello ");
        System.out.println(emptyVlaue.isEmpty());

    }
}
