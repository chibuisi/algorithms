package dailychallenge;

import java.util.HashMap;
import java.util.Map;

public class ModeOfArray {
    public static int solve(int [] array){
        if(array == null || array.length == 0)
            return -1;
        if(array.length == 1)
            return array[0];
        Map<Integer, Integer> countFrequency = new HashMap<>();
        int max = 1;
        int lastKey = 0;
        for(int i = 0; i < array.length; i++){
            if(countFrequency.containsKey(array[i])) {
                countFrequency.put(array[i], countFrequency.get(array[i]) + 1);
                if (max < countFrequency.get(array[i])) {
                    max = countFrequency.get(array[i]);
                    lastKey = array[i];
                }
                if(max == countFrequency.get(array[i]))
                    lastKey = Integer.min(lastKey, array[i]);
            }else {
                countFrequency.put(array[i],1);
            }
        }
        return lastKey;
    }

    public static void main(String[] args) {
        int [] arr = {27,11,15,15,27,11};
        System.out.println(solve(arr));
    }
}
