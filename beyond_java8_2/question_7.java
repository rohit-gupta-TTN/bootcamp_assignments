//Q.7
package beyond_java8_2;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class question_7 {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new LinkedHashMap<>() ;

        map.put(1, "Pawan");
        map.put(2, "Kunal");
        map.put(2, "Rohan");
        map.put(3, "Rohit");
        map.put(4, "Sanchit");
        map.put(5, "Deepika");

        System.out.println("Original map is : "+map + "\n");

        //printing first and last entry
        System.out.println("First entry in map is : "+map.firstEntry());
        System.out.println("Last entry in map is : "+map.lastEntry() + "\n");


        //adding value at first and last
        map.putFirst(0, "manish");
        map.putLast(6, "suresh");
        System.out.println("Added values at first and last position: " + map);

        //pulling out values on the basis of key
        System.out.println("Pulling key pair with least key: "+ map.pollFirstEntry());
        System.out.println("Pulling key pair with greatest key: "+ map.pollLastEntry());

        //printing revered map
        System.out.println(map.reversed());

    }
}