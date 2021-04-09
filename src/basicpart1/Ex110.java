package basicpart1;

public class Ex110 {
    
    public static void main(String args[]) {
        double n = 64;
        while (n != 1) {
            n /= 4;
            if ((int) n != n) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
