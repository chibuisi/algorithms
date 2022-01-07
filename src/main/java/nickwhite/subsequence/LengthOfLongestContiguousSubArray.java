package nickwhite.subsequence;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestContiguousSubArray {
    public static int solve(int [] nums){
        if(nums == null || nums.length == 0)
            return 0;
        int maxLength = 0;
        int count = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                count -= 1;
            if(nums[i] == 1)
                count += 1;
            if(counts.containsKey(count))
                maxLength = Math.max(maxLength, counts.get(count));
            else
                counts.put(count, i);
       }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{0,0,1,1,1,0,1,0,0,0}));
    }
}
