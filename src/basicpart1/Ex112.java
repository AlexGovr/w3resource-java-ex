package basicpart1;

public class Ex112 {

    public static void main(String args[]) {
        int n = 222555;
        int trailing_zeros = 0;
        int div = 5;
        while (div <= n) {
            trailing_zeros += n / div;
            div *= 5;
        }
        System.out.printf("trailing zeros of %s!: %s\n", n, trailing_zeros);
    }
}
