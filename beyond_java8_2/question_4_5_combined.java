//Q.4 Use a Sealed class Class concept to create a class hierarchy
//Q.5 Mark Child classes as final, sealed, and non sealed and observe their behavior
package beyond_java8_2;

sealed class A permits B,C{
void showA(){
    System.out.println("I an class A");
};
}
final class B extends A{
    void showB(){
        System.out.println("I an class B");
    };
}
non-sealed class C extends A{
    void showC(){
        System.out.println("I an class C");
    };
}
sealed class D extends C permits E {
    void showD(){
        System.out.println("I an class D");
    };
}

non-sealed class E extends D{
    void showE(){
        System.out.println("I an class E");
    };
}
public class question_4_5_combined {
    public static void main(String[] args) {
B b=new B();
C c=new C();
D d=new D();
E e=new E();
b.showA();
c.showA();
d.showA();
e.showA();
    }
}
