package basicpart1;

public class Ex109 {
    
    public static void main(String args[]) {
        int n = 60;
        // assuming n = x * (x + 1) / 2
        int x = (int) (Math.sqrt(0.25 + 2 * n) - 0.5);
        System.out.println("x " + x);
        if ((x * (x + 1) / 2) != n)
            x--;
        for(int i = 1; i <= x; i++) {
            System.out.println("$".repeat(i));
        }
    }
}
