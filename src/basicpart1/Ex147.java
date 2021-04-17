package basicpart1;

public class Ex147 {
    
    public static void main(String args[]) {
        int n = 27;
        int n1 = 2300;
        int count = 0;
        for (int i = n ^ n1; i != 0; i = i >>> 1 ){
            count += i & 1;
        }
        System.out.println(count);
    }
}