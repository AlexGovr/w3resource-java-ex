package basicpart2;

public class Ex190 {

    public static void main(String args[]) {
        String s1 = "Rim is playing the guitar";
        String s2 = "Rim is playing theuitar";
        String missing = "";
        int j = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                j = i;
                while (s1.charAt(j) != s2.charAt(i)) {
                    missing += s1.charAt(j);
                    j++;
                }
                break;
            }
        }
        if (missing == "") {
            missing = s1.substring(s2.length());
        }
        System.out.println(missing);
    }
}