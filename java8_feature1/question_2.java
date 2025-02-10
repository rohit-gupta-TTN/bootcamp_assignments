package java8_feature1;

@FunctionalInterface
interface panda{
    int operation(int a,int b);

}
class method_reference{
int add(int a,int b){
    return a+b;
};

int subtract(int a,int b){
        return b-a;
    };

static int multiply(int a,int b){
        return a*b;
    };
}
public class question_2
{
    public static void main(String[] args) {
        method_reference obj=new method_reference();
        panda p1=obj::add;
        panda p2=obj::subtract;
        panda p3=method_reference::multiply;

        System.out.println("adding 4 and 22 : "+ p1.operation(4,22));
        System.out.println("subtracting 4 from 22 : "+ p2.operation(4,22));
        System.out.println("multiplying 4 to 22 : "+ p3.operation(4,22));
    }
}
