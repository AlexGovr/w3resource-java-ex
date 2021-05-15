package basicpart2;

public class Ex156 {
    
    public static void main(String args[]) {
        int n = 2350;
        int pow = 0;
        System.out.printf("Original number: %s\n", n);
        while (n > 1) {
            n >>= 1;
            pow++;
        }
        System.out.println(pow);
    }
}