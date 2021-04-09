package basicpart1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex111 {

    public static void main(String args[]) {
        int a = 200;
        int b = 3400;
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        String res = new String();
        
        if (sa.length() < sb.length()) {
            String buf = sa;
            sa = sb;
            sb = buf;
        }

        int diff = sa.length() - sb.length();

        String mem = "0";
        String[] pre;
        String digitsum;
        for(int i = sb.length()-1; i >= 0 ; i--) {
            pre = sum_two(sa.charAt(i + diff), sb.charAt(i));
            digitsum = sum_two(pre[0].charAt(0), mem.charAt(0))[0];
            mem = pre[1];
            res = digitsum + res;
        }
        for(int i = diff-1; i >= 0; i--) {
            pre = sum_two(sa.charAt(i), '0');
            digitsum = sum_two(pre[0].charAt(0), mem.charAt(0))[0];
            mem = pre[1];
            res = digitsum + res;
        }
        if (mem != "0") {
            res = mem + res;
        }
        System.out.printf("%s + %s = %s\n", a, b, res);
    }

    public static String[] sum_two(char a, char b) {
        String[][] arr = {{"0", "0"}, {"1", "0"}, {"2", "0"}, {"3", "0"}, {"4", "0"},
                          {"5", "0"}, {"6", "0"}, {"7", "0"}, {"8", "0"}, {"9", "0"},
                          {"0", "1"}, {"1", "1"}, {"2", "1"}, {"3", "1"}, {"4", "1"},
                          {"5", "1"}, {"6", "1"}, {"7", "1"}, {"8", "1"}};
        ArrayList<String[]> sums = new ArrayList<String[]>(Arrays.asList(arr));
        return sums.subList(char2int(a), 17).get(char2int(b));
    }

    public static int char2int(char c) {
        return c - '0';
    }
}
