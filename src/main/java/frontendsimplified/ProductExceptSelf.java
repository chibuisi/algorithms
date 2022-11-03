package frontendsimplified;

import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] solve1(int [] nums){
        int len = nums.length;

        int [] left = new int[len];
        int [] right = new int[len];

        left[0] = 1;
        right[right.length - 1] = 1;

        for(int i = 1; i < len; i++){
            left[i] = left[i - 1] * nums[i - 1];
        }

        for(int i = len - 2; i >= 0; i--){
            right[i] = right[i + 1] * nums[i + 1];
        }

        int [] result = new int[len];
        for(int i = 0; i < len; i++){
            result[i] = left[i] * right[i];
        }

        return result;
    }

    public static int[] solve2(int [] nums){
        int len = nums.length;

        int [] result = new int[len];
        result[0] = 1;


        for(int i = 1; i < len; i++){
            result[i] = result[i - 1] * nums[i - 1];
        }

        int r = 1;
        for(int i = len - 1; i >= 0; i--){
            result[i] = result[i] * r;
            r = r * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int [] array1 = {1,2,3,4}; // expected [24, 12, 8, 6]
        System.out.println(Arrays.toString(solve1(array1)));
        System.out.println(Arrays.toString(solve2(array1)));
    }
}
