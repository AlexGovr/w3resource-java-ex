package basicpart1;

public class Ex115 {
    
    public static void main(String args[]) {
        int n = 15512;
        String s = String.valueOf(n);
        int len = s.length();
        System.out.printf("Is %s is a palindrome number?\n", n);
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}