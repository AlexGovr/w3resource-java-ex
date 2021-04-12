package basicpart1;

public class Ex66 {
    
    public static void main(String args[]) {
        int sum = 0;
        int i = 0;
        int num = 2;
        while (i<100) {
            if (Ex48.is_prime(num)) {
                sum += num;
                i++;
            }
            num++;
        }
        System.out.println(sum);
    }
}
 