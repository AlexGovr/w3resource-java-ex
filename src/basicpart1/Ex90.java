package basicpart1;

public class Ex90 {
    
    public static void main(String args[]) {
        System.out.println("Current system PATH:");
        System.out.println(System.getenv("PATH"));
        System.out.println("Current system TEMP:");
        System.out.println(System.getenv("TEMP"));
        System.out.println("Current system USERNAME:");
        System.out.println(System.getenv("USERNAME"));
    }
}