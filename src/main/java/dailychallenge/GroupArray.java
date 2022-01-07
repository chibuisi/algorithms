package dailychallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class GroupArray {
    public static List<List<Integer>> solve(int [] arr, int k){
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for(int num : arr)
            treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
        List<List<Integer>> res = new ArrayList<>();
        while(!treeMap.isEmpty()){

            List<Integer> integerList = new ArrayList<>();
            for(int i = 0; i < k; i++){
                int minValue = -1;
                if(!treeMap.isEmpty())
                    minValue = treeMap.firstKey();
                int count = 0;
                if(treeMap.containsKey(minValue))
                    count = treeMap.get(minValue);
                if(minValue > -1)
                    integerList.add(minValue);
                if(count == 1)
                    treeMap.remove(minValue);
                else
                    treeMap.replace(minValue, count-1);
            }
            res.add(integerList);
        }
        return res;
    }
}
