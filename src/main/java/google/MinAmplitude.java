package google;

import java.util.Arrays;

public class MinAmplitude {
    public static void main(String[] args) {
        int [] nums = new int[]{6,6,0,1,1,4,6};
        int res = minDifference(nums);
        System.out.println(res);
    }
    public static int minDifference(int[] nums) {
        int n = nums.length;
        if(n < 4)
            return 0;
        //time to sort in O(nlogn)
        Arrays.sort(nums);
        int opt1 = nums[n-4] - nums[0];
        int opt2 = nums[n-3] - nums[1];
        int opt3 = nums[n-2] - nums[2];
        int opt4 = nums[n-1] - nums[3];
        return Math.min(opt1,Math.min(opt2,Math.min(opt3,opt4)));
    }
}

