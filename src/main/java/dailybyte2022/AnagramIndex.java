package dailybyte2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramIndex {
    public static void main(String[] args) {
        int [] arr1 = {8,23,2};
        int [] arr2 = {2,23,8};
        System.out.println(solve(arr1,arr2));
    }
    public static List<Integer> solve(int [] arr1, int [] arr2){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> indexes = new HashMap();
        for(int i = 0; i < arr2.length; i++){
            indexes.put(arr2[i], i);
        }
        for(int i = 0; i < arr1.length; i++){
            result.add((Integer) indexes.get(arr1[i]));
        }
        return result;
    }
}
