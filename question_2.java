
import java.util.*;
class SalaryComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return (int) (emp2.Salary-emp1.Salary); //Sorting in Descending order (High to Low)
    }
}
class Employee implements Comparable<Employee>
{
    Double Age;
    Double Salary;
    String Name;
    Employee(String Name, Double Salary, Double Age)
    {
        this.Name=Name;
        this.Age=Age;
        this.Salary=Salary;
    }
    @Override
    public int compareTo(Employee emp) {
        return Name.compareTo(emp.Name);
    }

    @Override
    public String toString() {
        return "\n\nName :- "+Name+"\nAge :- "+Age+"\nSalary :- "+Salary;
    }
}
public class question_2 {
    public static void main(String[] args) {
        List<Employee> listOfEmp= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        String ch="";
        do {
            //Inputting Name
            System.out.print("\nEnter Name: ");
            String name = sc.nextLine();
            //Inputting Age
            System.out.print("Enter Age: ");
            double age = sc.nextDouble();
            //Inputting Salary
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); //wasn't able to take QUIT input
            Employee user = new Employee(name, salary, age);
            listOfEmp.add(user);
            System.out.print("\nDo you want to continue creating users? (y/n)");
            ch=sc.nextLine();
        }while(!ch.equals("n"));
        Collections.sort(listOfEmp);
        System.out.println("\n Sorted according to the name :- ");
        for(Employee emp: listOfEmp)
        {
            System.out.println(emp);
        }
        Collections.sort(listOfEmp, new SalaryComparator());
        System.out.println("\n Sorted according to the Salary :- ");
        for(Employee emp: listOfEmp)
        {
            System.out.println(emp);
        }
    }
}


