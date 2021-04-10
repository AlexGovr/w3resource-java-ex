package basicpart1;

public class Ex116 {
    
    public static void main(String args[]) {
        
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0)
                if (i % 5 == 0)
                    System.out.println("fuzz buzz");
                else
                    System.out.println("Fuzz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}