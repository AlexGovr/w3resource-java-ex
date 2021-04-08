package basicpart1;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex62 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input three numbers: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        ArrayList<Double> arr = new ArrayList();
        double target = 0;
        boolean factor = false;

        arr.add(x);arr.add(y);arr.add(z);

        for (double i: arr) {
            factor = i >= 20;
            if (target>0)
                factor = i >= 20 & i < target;
            if (factor)
                target = i;
        }
        if (target>0) {
            arr.remove(target);
            if (target < Math.abs(arr.get(0) - arr.get(1))) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
 