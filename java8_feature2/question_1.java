package java8_feature2;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class question_1 {
    public static void main(String[] args) {

        Predicate <Integer> greaterthanfive =x->x>5;
        Function <Integer,Integer> square = x -> x * x;
        Consumer <String> printsomething=x-> System.out.println(x);
        Supplier <Float> imsupplier=()->3.5f;

        System.out.println(greaterthanfive.test(8));
        System.out.println(square.apply(8));
        printsomething.accept("hello panda");
        System.out.println(imsupplier.get());
};
};
