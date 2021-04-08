package basicpart1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex67 {
    
    public static void main(String args[]) {
        ArrayList txt = new ArrayList(Arrays.asList("Python 3.0".split(" ")));
        txt.add(1, "tutorial");
        System.out.println(String.join(" ", txt));
    }
}
 