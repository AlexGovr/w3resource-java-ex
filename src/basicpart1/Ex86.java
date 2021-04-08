package basicpart1;

public class Ex86 {
    
    public static void main(String args[]) {
        int n = 108;
        int count = 0;
        for (int i=1; i < 110; i++){
            n = i;
            count = 0;
            while (n != 1) {
                if (n % 2 == 0)
                    n /= 2;
                else
                    n = n*3 + 1;
                count++;
            }
            System.out.println(i + " " + count);
        }
    }
}