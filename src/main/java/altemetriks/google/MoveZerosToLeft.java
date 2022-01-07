package altemetriks.google;

import java.util.Arrays;

public class MoveZerosToLeft {
    public static void solve(int [] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            while(left < right && nums[left] == 0)
                left++;
            while(right > left && nums[right] != 0)
                right--;
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int [] nums = {0, 2, 4, 0, 3, 2, 0};
        solve(nums);
        System.out.println(Arrays.toString(nums));
    }
}
