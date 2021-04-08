package basicpart1;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Ex47 {
    
    public static void main(String args[]) {
        SimpleDateFormat dt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        dt.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.printf("Current time is: %s\n", dt.format(System.currentTimeMillis()));
    }
}
