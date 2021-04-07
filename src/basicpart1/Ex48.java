package basicpart1;

public class Ex48 {
    
    public static void main(String args[]) {
        for (int n = 0; n < 100; n++){
            if (n % 2 != 0)
                System.out.println(n);
        }
    }

    public static boolean is_prime(int d) {
        for (int i = 2; i < (int) Math.sqrt(d) + 1; i++) {
            if ((d % i) == 0)
                return false;
        }
        return true;
    }
}
