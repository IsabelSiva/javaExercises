package openingChapters;

import java.time.Instant;

public class DateTest {
    public static void main(String []args){
        Instant dateI = Instant.now();
        System.out.println(dateI);
        Instant date = Instant.now();

        System.out.println(dateI.compareTo(date));
    }
}
