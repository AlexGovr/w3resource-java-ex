package basicpart2;

public class Ex154 {
    
    public static void main(String args[]) {
        char[] map = {'f', 't'};
        boolean[][] arr = {{true, false, true},
                           {false, true, false}};
        for (boolean[] bs : arr) {
            for (boolean v : bs) {
                System.out.print(map[v ? 1 : 0] + " ");
            }
            System.out.println();
        }
    }
}