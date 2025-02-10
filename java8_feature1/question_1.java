package java8_feature1;
@FunctionalInterface
 interface hello1{
     boolean isgreater(int a,int b);
}
@FunctionalInterface
interface hello2{
    int increment(int a);
}
@FunctionalInterface
interface hello3{
    String  concatenating(String a,String  b);
}
@FunctionalInterface
interface hello4{
    String  toupper(String a);
}

public class question_1 {
    public static void main(String[] args) {
        hello1 h1=(a,b)->a>b;
        int a=5;
        int b=7;
        System.out.println("is "+a+" greater than "+b+" : "+ h1.isgreater(a,b));

        hello2 h2=(c)->c+1;
        int c=8;

        System.out.println(c+ " after incrementing by 1 is : "+ h2.increment(c));

        hello3 h3=(d,e)->d+e;
        String d="hello";
        String e="world";
        System.out.println("\""+ d +"\""+" and " + "\""+e+"\""+ " after concatenation is : "+ h3.concatenating(d,e));

        hello4 h4=(f)->f.toUpperCase();
        String f=" hellO panda";
        System.out.println(" after converting string : "+"\""+f+"\""+" to uoppercase : "+ h4.toupper(f));

    }
}
