package frontendsimplified;

import java.util.HashMap;
import java.util.Map;

public class ContainsDupes {
    public static boolean solve(int [] arr){
        Map<Integer, Integer> countFreq = new HashMap<>();
        for(int i : arr){
            countFreq.put(i, countFreq.getOrDefault(countFreq.get(i),0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : countFreq.entrySet()){
            if(entry.getValue() > 1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,3,4,5,6,7,8,9,1}));
    }
}
