package practice;

import java.util.Arrays;

public class SortStringArrayWithComparator {
    public static String solve(String [] array){
        Arrays.sort(array, (a,b) -> {
            int t10 = Integer.parseInt(a.substring(0,2));
            int t20 = Integer.parseInt(b.substring(0,2));
            int t11 = Integer.parseInt(a.substring(3));
            int t21 = Integer.parseInt(b.substring(3));
            if(t10 == t20)
                return t11 - t21;
            return t10-t20;
        });
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        String [] array = {"12:30", "09:40", "08:50", "12:50", "21:60"};
        String t1 = array[0].substring(3);
        int t11 = Integer.parseInt(t1);
        //System.out.println(t11);
        System.out.println(solve(array));
    }
}
