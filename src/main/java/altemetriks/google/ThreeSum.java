package altemetriks.google;

import java.util.Arrays;

public class ThreeSum {
    public static boolean solve(int [] nums, int target){
        if(nums == null || nums.length < 3)
            return false;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            int left = i + 1;
            int right = nums.length-1;
            int curr = nums[i];
            while(left < right){
                int sum = curr + nums[left] + nums[right];
                if(sum == target)
                    return true;
                else if(sum < target)
                    left++;
                else
                    right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,2,6,8,7};
        System.out.println(solve(nums, 6));
    }
}
