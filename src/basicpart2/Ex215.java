package basicpart2;

public class Ex215 {
    
    public static void main(String args[]) {
        long loan = 100000;
        int months = 6;
        double mult = 1.04;
        for (int i = 0; i < months; i++) {
           loan = Math.round(loan * mult / 1000) * 1000; 
        }
        print(String.valueOf(loan));
    }

    public static void print(String s) {
        System.out.println(s);
    }
}