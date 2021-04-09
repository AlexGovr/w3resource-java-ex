package basicpart1;

public class Ex108 {
    
    public static void main(String args[]) {
        long n = 1123;
        System.out.println(n);
        
        while (!has_one_digit(n)) {
            n += sum_of_digits(n);
        }
        System.out.println(n);
    }

    public static boolean has_one_digit(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        for(char c: chars){
            if(c != chars[0])
                return false;
        }
        return true;
    }

    public static long sum_of_digits(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        long sum = 0;
        for(char c: chars) {
            sum += (long) (c - '0');
        }
        return sum;
    }
}
