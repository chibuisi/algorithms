package keap;

import java.util.Arrays;

public class BinarySearch {
    public static int search(int [] nums, int key){
        if(nums == null || nums.length == 0)
            return -1;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        return search(nums, key, left, right);
    }

    private static int search(int [] nums, int key, int left, int right){
        if(left > right)
            return -1;
        int mid = left + (right - left) / 2;
        if(nums[mid] == key)
            return mid;
        if(nums[mid] > key)
            return search(nums, key, left, mid-1);
        else
            return search(nums, key, mid+1, right);
    }

    public static void main(String[] args) {
        int [] nums = {2,3,1,4,5,7,8,9};
        System.out.println(search(nums, 10));
    }
}
