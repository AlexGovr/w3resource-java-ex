package basicpart1;

public class Ex91 {
    
    public static void main(String args[]) {
        long t = System.nanoTime();
        if (4 < 9)
            System.out.println("4 is less than 9");
        System.out.println((System.nanoTime() - t) + " secs");
    }
}