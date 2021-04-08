package basicpart1;

public class Ex78 {
    
    public static void main(String args[]) {
        int[] arr = {10, 4, 30};

        for(int i: arr) {
            if (i == 4 | i == 7) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
