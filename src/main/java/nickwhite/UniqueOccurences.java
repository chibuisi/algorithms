package nickwhite;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurences {
    public static boolean solve(int [] array){
        /*Map<Integer,Integer> countFrequency = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            countFrequency.put(array[i], countFrequency.getOrDefault(array[i], 0) + 1);
        }*/
        //Set<Integer> occurences = new HashSet<>(countFrequency.values());
        Set<Integer> uniqueItems = new HashSet<>();
        for(int num : array){
            uniqueItems.add(num);
        }
        return uniqueItems.size() == array.length;
    }

    public static void main(String[] args) {
        int [] nums = {2,4,6,3,2};
        System.out.println(solve(nums));
    }
}
