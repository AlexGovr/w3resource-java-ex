package basicpart2;

public class Ex169 {
    
    public static void main(String args[]) {
        String s = "this is the sentence";
        String[] words = s.split(" ");
        s = words[0];
        for (int i = 1; i < words.length; i++) {
            s = words[i] + " " + s;
        }
        System.out.println(s);
    }
}