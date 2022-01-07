package altemetriks.google.dp;

public class MaximumSubarray {
    public static int solve(int [] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int [] dp = new int [nums.length+1];
        dp[0] = nums[0];
        int maxSum = 0;
        for(int i = 1; i < nums.length; i++){
            dp[i] = Integer.max(dp[i-1] + nums[i], nums[i]);
            if(dp[i] > maxSum)
                maxSum = dp[i];
        }
        return maxSum;
    }
    public static int solve2(int [] nums){
        if(nums == null || nums.length == 0)
            return 0;
        int currMax = nums[0];
        int maxSum = Integer.MIN_VALUE;

        for(int i = 1; i < nums.length; i++){
            currMax = Integer.max(nums[i] + currMax, nums[i]);
            if(currMax > maxSum)
                maxSum = currMax;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int [] nums1 = {-2,-3,4,-1,-2,1,5,-3}; ////expected = 7
        int [] nums2 = {-2,1,-3,4,-1,2,1,-5,4}; //expected = 6
        int [] nums3 = {-1,-2};
        System.out.println(solve(nums1));
        System.out.println(solve2(nums1));
        System.out.println(solve(nums2));
        System.out.println(solve2(nums2));
        System.out.println(solve(nums3));
        System.out.println(solve2(nums3));
    }
}
