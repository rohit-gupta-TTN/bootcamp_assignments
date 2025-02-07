
import java.util.*;

public class question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Float> nums=new ArrayList<>();
        int n=5;
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter the %d value :- ",i+1);
            nums.add(sc.nextFloat());
        }
        float sum=0;
        Iterator<Float> it = nums.iterator();
        while(it.hasNext())
        {
            sum+=it.next();
        }
        System.out.println("Sum of the 5 float number :- "+ sum);
    }
}
