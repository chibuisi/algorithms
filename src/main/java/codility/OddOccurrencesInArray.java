package codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int [] arr = {9,3,9,3,9,7,9};
        System.out.println(solutionOne(arr));
    }
    public static int solutionOne(int [] A){
        Map<Integer, Integer> pairs = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            Integer curr = A[i];
            if(pairs.containsKey(curr)){
                int newValue = pairs.get(curr) + 1;
                pairs.put(curr, newValue);
            }
            else{
                pairs.put(curr, 1);
            }
        }
        for(Map.Entry e : pairs.entrySet()){
            Integer count = (Integer) e.getValue();
            Integer value = (Integer) e.getKey();
            if(count % 2 > 0){
                return value;
            }
        }
        return 0;
    }
}
