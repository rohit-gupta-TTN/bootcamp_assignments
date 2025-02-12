package java8_feature2;

import java.util.Arrays;
import java.util.List;

public class question_3 {
    public static void main(String[] args) {
        List<Integer> numlist = Arrays.asList(2, 5, 6, 8, 1, 9, 10);
        System.out.println(numlist.stream().filter(x->x>5).reduce(0,(a,b)->a+b));
    }
}