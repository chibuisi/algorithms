package altemetriks.google;

import java.util.HashMap;
import java.util.Map;

public class SumTwoEqualK {
    public static boolean solve(int [] nums, int k){
        Map<Integer, Integer> diffMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int difference = k - nums[i];
            if(diffMap.containsKey(difference))
                return true;
            diffMap.put(nums[i], difference);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {2,4,6,3};
        System.out.println(solve(nums, 10));
    }
}

// 2, 4, 6, 3, k=10
//[2, 4,
