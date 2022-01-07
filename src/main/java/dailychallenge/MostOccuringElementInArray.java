package dailychallenge;

import java.util.HashMap;
import java.util.Map;

public class MostOccuringElementInArray {
    public static int solve(int [] arr){
        Map<Integer, Integer> counts = new HashMap<>();
        int maxKey = arr[0];
        int maxCount = 1;
        for(int i = 0; i < arr.length; i++){
            counts.put(arr[i], counts.getOrDefault(arr[i], 0) + 1);
            int currCount = counts.get(arr[i]);
            if(maxCount < currCount){
                maxCount = currCount;
                maxKey = arr[i];
            }
            if(maxCount == currCount)
                maxKey = Integer.min(maxKey,arr[i]);
        }
        return maxKey;
    }

    public static void main(String[] args) {
        int [] arr = {4,1,2,3,2,3,3,1,1,3,1};
        System.out.println(solve(arr));
    }
}
