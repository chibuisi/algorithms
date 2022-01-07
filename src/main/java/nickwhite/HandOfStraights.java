package nickwhite;

import java.util.*;

public class HandOfStraights {
    public static boolean solve(int [] nums, int w){
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for(int num : nums)
            treeMap.put(num, treeMap.getOrDefault(num, 0)+1);
        while(!treeMap.isEmpty()){
            int minValue = treeMap.firstKey();
            for(int value = minValue; value < minValue + w; value++){
                if(!treeMap.containsKey(value))
                    return false;
                int count = treeMap.get(value);
                if(count == 1)
                    treeMap.remove(value);
                else
                    treeMap.replace(value, count-1);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,2,3,4,7,8};
        System.out.println(solve(arr,3));
    }
}
