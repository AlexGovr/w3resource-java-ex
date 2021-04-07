package basicpart1;

import java.nio.charset.Charset;

public class Ex40 {
    
    public static void main(String args[]) {
        System.out.println("Available charsets:");
        for(String key: Charset.availableCharsets().keySet()) {
            System.out.println(key);
        }
    }
}
