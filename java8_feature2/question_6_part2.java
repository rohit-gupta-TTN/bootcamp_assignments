package java8_feature2;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class question_6_part2 {
    public static void main(String[] args) {


    ZonedDateTime calcuttaTime=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
    ZonedDateTime londonTime=ZonedDateTime.now(ZoneId.of("Europe/London"));
    ZonedDateTime newyorkTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("current time in culcutta is: "+calcuttaTime);
        System.out.println("current time in london is: "+londonTime);
        System.out.println("current time in new york is: "+newyorkTime);

}
}
