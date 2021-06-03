package basicpart2;

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex225 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        print("Input year, month and day:");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();
        Calendar day = new GregorianCalendar(y, m, d);
        print(day.get(Calendar.DAY_OF_WEEK));
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}