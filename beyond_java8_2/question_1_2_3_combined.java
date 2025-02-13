//Q.1Create a Record for the Student with the following Fields:
//id
//name
//standard

//Q.2Make sure that no null values should be used for initialization.

//Q.3Use equal and hashCode methods with Student records
package beyond_java8_2;

import java.util.Objects;

record student (int id,String name,int standard){
  student{ Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(standard);};
};
public class question_1_2_3_combined {
    public static void main(String[] args) {
        student student1=new student(1,"rohit gupta",44);
        student student2=new student(2,"kunal rawat",32);
        student student3=new student(1,"rohit gupta",44);
        System.out.println(student1.equals(student3));
        System.out.println(student3.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student1.toString());

    }
}
