package hackerrank;

import java.util.Arrays;

public class RotateArray {
    public static void solve(int [] nums, int d){
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, d-1);
        reverse(nums, d, nums.length-1);
    }

    private static void reverse(int [] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        solve(nums, 1);
        System.out.println(Arrays.toString(nums));
    }
}
