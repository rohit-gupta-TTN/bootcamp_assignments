//Q.4 Create Unmodifiable List from a Steam

package beyondjava8_features2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class question_4 {
    public static void main(String[] args) {
        List<Integer> rollno= Arrays.asList(1,5,2,7,5,89,53);
        List<Integer>newrollno=new ArrayList<>();
                newrollno=rollno.stream().map(i->i+3).collect(Collectors.toUnmodifiableList());
        System.out.println(newrollno);
    }
}
