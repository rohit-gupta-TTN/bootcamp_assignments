//Q.3 Use Of method to create List, Set and Map

package beyondjava8_features2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class question_3 {
    public static void main(String[] args) {
        List<Integer> samplelist = List.of(32443, 54, 3, 23, 342, 312, 1, 1, 313455);
        Set<Integer> sampleset=Set.of(1,21,23,422,5,6346,7);
        Map<String,Integer> samplemap=Map.of("rohit",1,"kunal",2,"Krisha",3);
        System.out.println(samplelist);
        System.out.println(sampleset);
        System.out.println(samplemap);
    }
}
