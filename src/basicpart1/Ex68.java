package basicpart1;

public class Ex68 {
    
    public static void main(String args[]) {
        String txt = "p 3.0";
        int len = txt.length();
        String sub = txt.substring(len-3, len);
        txt = sub + sub + sub;
        System.out.println(txt);
    }
}
 