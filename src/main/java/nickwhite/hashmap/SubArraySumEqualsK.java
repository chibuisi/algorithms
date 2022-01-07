package nickwhite.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static int solve(int [] nums, int k){
        int result = 0;
        int sum = 0;
        Map<Integer, Integer> sums = new HashMap<>();
        sums.put(0,1);

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sums.containsKey(sum-k))
                result += sums.get(sum-k);
            sums.put(sum, sums.getOrDefault(sum, 0)+1);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,1,4,};
        System.out.println(solve(arr,3));
    }
}
