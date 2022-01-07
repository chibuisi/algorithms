package nickwhite.dp;

import java.util.Arrays;

public class MaximumSubArray {
    public static int solve1(int [] nums){
        if(nums == null || nums.length == 0)
            return 0;
        int maxSum = 0;
        int [] dp = new int[nums.length+1];
        dp[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            dp[i] = Integer.max(dp[i-1] + nums[i], nums[i]);
            if(dp[i] > maxSum)
                maxSum = dp[i];
        }
        System.out.println(Arrays.toString(dp));
        return maxSum;
    }

    public static void main(String[] args) {
        int [] nums1 = {-2,1,-3,4,-1,2,1,-5,4}; //expected = 6
        System.out.println(solve1(nums1));
    }
}
