package leetcode.easy;

import java.util.Arrays;

public class ShiftArrays {
    public static void main(String[] args) {
        int [] nums = new int[]{0,1,2,2,3,0,4,2};
        int result = shiftEements(nums,0);
        System.out.println(result);
    }
    public static int shiftEements(int [] nums, int pos){
        for(int i = pos; i < nums.length - 1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = 0;
        System.out.println(Arrays.toString(nums));
        return pos;
    }
}
