package riotgames.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3Closest {
    public static void main(String[] args) {

    }
    public static int threeSumClosest(int [] nums, int target){
        if(nums == null || nums.length == 0) return 0;
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > target){
                    right--;
                } else{
                    left++;
                }
                if(Math.abs(sum - target) < Math.abs(result-target)){
                    result = Math.abs(sum-target);
                }
            }
        }

        return result;
    }
}
