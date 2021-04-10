package basicpart1;

public class Ex118 {
    
    public static void main(String args[]) {
        String s = "a long string";
        String sub = "long";
        System.out.println("Occurence of \"" + sub + "\" in \"" + s + "\"");
        System.out.println("Occurence at: " + s.indexOf(sub, 0));
    }
}