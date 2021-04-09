package basicpart1;

public class Ex114 {
    
    public static void main(String args[]) {
        String s = "go study some Java";
        int init_shift = 3;
        System.out.println("Initial string: " + s);
        
        int shift = s.length();
        int newend = s.length() - shift;
        s = s.substring(newend) + s.substring(0, newend);
        System.out.printf("Shifted by %s string: %s\n", init_shift, s);
    }
}