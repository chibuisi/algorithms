package geeks;

import java.util.Arrays;

public class Segregate0AND1 {
    public static void main(String[] args) {
        int [] nums = {0,1,1,1,0,0,1,0,1,0,0,1,1,1,0};
        int [] nums2 = {0,1,1,1,0,0,1,0,1,0,0,1,1,1,0};
        segragateNums(nums);
        System.out.println(Arrays.toString(nums));
        segragateNums2(nums2);
        System.out.println(Arrays.toString(nums2));
    }

    public static void segragateNums(int [] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            while(nums[left] == 0 && left < right)
                left++;

            while(nums[right] == 1 && left < right)
                right--;

            if(left < right){
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }

        }
    }

    public static void segragateNums2(int [] nums){
        int c0 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) c0++;
        }
        int index = 0;
        while(index < c0){
            nums[index++] = 0;
        }
        while(index < nums.length){
            nums[index++] = 1;
        }
    }
}
