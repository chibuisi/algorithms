package dailybyte;

import java.util.*;

public class IntersectionOfNumbers {
    public static int [] solve(int [] num1, int [] num2){
        //there are duplicates
        //there are no negative values
        //the arrays might be null or empty
        //the solution can proceed with single value in array
        if(num1 == null || num2 == null || num1.length == 0 || num2.length == 0)
            return new int[0];
        Set<Integer> num1Set = new HashSet<>();
        for(int i : num1){
            num1Set.add(i);
        }

        List<Integer> result = new ArrayList<>();
        for(int i : num2){
            if(num1Set.contains(i))
                result.add(i);
        }
        int [] ints = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            ints[i] = result.get(i);
        }

        return ints;
    }

    public static int [] solve2(int [] num1, int [] num2){
        if(num1 == null || num2 == null || num1.length == 0 || num2.length == 0)
            return new int[0];
        Arrays.sort(num1);
        Arrays.sort(num2);
        int i = 0, j =0;
        List<Integer> intersections = new ArrayList<>();
        while(i < num1.length && j < num2.length){
            if(num1[i] == num2[j]){
                intersections.add(num1[i]);
            }
            while(num1[++i] <= num1[i+1]){}
            while(num2[++j] <= num1[i]){}
        }
        int [] result = new int[intersections.size()];
        for(int k = 0; k < result.length; k++){
            result[k] = intersections.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] num1 = {2,4,4,2}, num2 = {2,4}; // return [2,4]
        int [] num3 = {1,2,3,3}, num4 = {3,3}; // return [3,3]
        int [] num5 = {2,4,6,8}, num6 = {1,3,5,7}; // return []
        System.out.println(Arrays.toString(solve2(num1, num2)));
        System.out.println(Arrays.toString(solve(num3, num4)));
        System.out.println(Arrays.toString(solve(num5, num6)));
    }
}
