package basicpart1;

import java.io.Console;

public class Ex41 {
    
    public static void main(String args[]) {
        Console cons = System.console();
        char[] passw = cons.readPassword("Input password:");
        System.out.println("Your password was: " + new String(passw));
    }
}
