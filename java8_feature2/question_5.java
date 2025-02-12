package java8_feature2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{
    String fullName;
    Long salary;
    String city;
    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}

public class question_5 {
    public static void main(String[] args) {

        Employee e1=new Employee("Rohit Gupta",35000l,"delhi");
        Employee e2=new Employee("Mayankkumar Tyagi",4000l,"noida");
        Employee e3= new Employee("Manoj Jain",2000l,"delhi");
        Employee e4=new Employee("Nikita Singh",4999l,"delhi");
        List<Employee> empList=Arrays.asList(e1,e2,e3,e4);

        List<String> filteredNames=new ArrayList<String>();
        empList.stream().filter(obj->obj.salary<5000 && obj.city.equalsIgnoreCase("delhi"))
                .distinct().forEach(obj->filteredNames.add(obj.fullName.split(" ")[0]));
        System.out.println(filteredNames);
}
}