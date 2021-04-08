package basicpart1;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Ex55 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
        time.setTimeZone(TimeZone.getTimeZone("GMT"));

        System.out.print("Input seconds : ");
        long millisecs = input.nextLong()*1000;
        System.out.println("The result is: " + time.format(millisecs));
    }
}
