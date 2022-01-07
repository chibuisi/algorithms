package altemetriks.google;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int solve(int [] nums, int target){
        if(nums == null || nums.length < 3)
            return 0;
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            int curr = nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = curr + nums[left] + nums[right];
                if(sum < target)
                    left+=1;
                else
                    right-=1;
                if(sum - target < result - target)
                    result = sum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,6,8,7};
        System.out.println(solve(nums, 6));
    }
}
