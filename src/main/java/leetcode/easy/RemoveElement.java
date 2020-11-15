package leetcode.easy;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int [] nums = new int[]{0,1,2,2,3,0,4,2};
        int result = removeEement(nums,2);
        System.out.println(result);
    }
    public static int removeEement(int [] nums, int val){
        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[pos] = nums[i];
                pos++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return pos;
    }
}
