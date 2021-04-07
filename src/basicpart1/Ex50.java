package basicpart1;

import java.util.ArrayList;

public class Ex50 {
    
    public static void main(String args[]) {

        ArrayList on3 = new ArrayList();
        ArrayList on5 = new ArrayList();
        ArrayList both = new ArrayList();

        for (int n = 1; n < 100; n++){
            if (n % 3 == 0)
                if (n % 5 == 0)
                    both.add(n);
                else
                    on3.add(n);
            else if (n % 5 == 0)
                on5.add(n);
        }

        System.out.println("Divided by 3:" + on3);
        System.out.println("Divided by 5:" + on5);
        System.out.println("Divided by both:" + both);

    }
}
