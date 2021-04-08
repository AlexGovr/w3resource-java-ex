package basicpart1;

public class Ex15 {
    
    public static void main(String args[]) {
        
        double a, b;
        a = 1;
        b = 3;
        System.out.printf("%.1f %.1f\n", a, b);
        double buf = a;
        a = b;
        b = buf;
        System.out.printf("%.1f %.1f\n", a, b);
    }
}