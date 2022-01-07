package keap.arrays;

import java.util.Arrays;

public class LargestSmallestArrayElement {
    public static int [] solution1(int [] nums){
        int [] result = {-1,-1};
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            if(current > nums[1])
                result[1] = current;
            if(current < nums[0])
                result[0] = current;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1,2,3,4,5,9,0})));
    }
}
