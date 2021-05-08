package altemetriks.riot;

import java.util.Arrays;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int [] arr = {10,3,5,6,2};
        System.out.println(Arrays.toString(solutionOne(arr)));
    }
    public static long[] solutionOne(int[] nums){
        long[] result = new long[nums.length];
        long total = 1;
        for(int i : nums)
            total *= i;
        for(int i = 0; i < nums.length; i++){
            result[i] = total/nums[i];
        }
        return result;
    }
    public static int[] solutionTwo(int[] nums){
        long total = 1;
        for(int i : nums)
            total *= i;
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) total * (int) Math.pow(nums[i], -1);
        }
        return nums;
    }
}
