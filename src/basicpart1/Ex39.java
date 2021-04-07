package basicpart1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex34 {
    
    public static void main(String args[]) {
        ArrayList<ArrayList> all_perms = new ArrayList();
        int[] nums = {1, 2, 3};
        ArrayList<ArrayList> perms = get_premutations(arrToArrayList(nums)); 
        all_perms.addAll(perms);
        int[] nums1 = {1, 3, 4};
        perms = get_premutations(arrToArrayList(nums1)); 
        all_perms.addAll(perms);
        int[] nums2 = {1, 2, 4};
        perms = get_premutations(arrToArrayList(nums2)); 
        all_perms.addAll(perms);
        int[] nums3 = {2, 3, 4};
        perms = get_premutations(arrToArrayList(nums3));
        all_perms.addAll(perms);

        for (int i = 0; i < all_perms.size(); i++) {
            ArrayList perm = all_perms.get(i);
            System.out.println((int)perm.get(0)*100 + (int)perm.get(1)*10 + (int)perm.get(2));
        }
        System.out.println("Total number: " + all_perms.size());
    }

    public static ArrayList<ArrayList> get_premutations(ArrayList<Integer> list) {
        ArrayList<ArrayList> perms = new ArrayList();

        if (list.size() == 1){
            perms.add(list);
            return perms;
        }
        
        for (int i = 0; i < list.size(); i++) {
            ArrayList sub = new ArrayList(list);
            sub.remove(i);
            ArrayList<ArrayList> child_perms = get_premutations(sub);
            
            for (int j = 0; j < child_perms.size(); j++) {

                ArrayList cur = new ArrayList();
                cur.add(list.get(i));
                cur.addAll(child_perms.get(j));
                perms.add(cur);
            }
        }
        return perms;
    }

    public static ArrayList arrToArrayList(int arr[]) {
        ArrayList arrl = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            arrl.add(arr[i]);
        }
        return arrl;
    }
}
