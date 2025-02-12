package java8_feature2;

interface example{
    default void mango(){
        System.out.println("I m mango.");
    };
    static void banana(){
        System.out.println("I m banana.");
    }
}
class exmapleclass implements example{
}
public class question_2 {
    public static void main(String[] args) {
        exmapleclass obj = new exmapleclass();
        obj.mango();
        example.banana();
    }
}
