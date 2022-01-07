package keap.arrays;

import java.util.Arrays;

public class RotateArray {
    public static int [] solution1(int [] nums, int d){
        int [] result = new int[nums.length];
        int index = 0;
        for(int i = d; i < nums.length; i++){
            result[index++] = nums[i];
        }
        for(int i = 0; i < d; i++){
            result[index++] = nums[i];
        }
        return result;
    }

    public static int [] solution2(int [] nums, int d){
        while(d > 0){
            int curr = nums[0];
            for(int i = 1; i < nums.length; i++){
                nums[i-1] = nums[i];
            }
            nums[nums.length-1] = curr;
            d--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution2(nums, 2)));
    }
}
