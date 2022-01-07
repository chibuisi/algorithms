package keap.arrays;

import java.util.Arrays;

public class SumArrayElements {
    public static int solution1(int [] nums){
        return Arrays.stream(nums).sum();
    }
    public static int solution2(int [] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
}
