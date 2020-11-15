package riotgames.practice;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2,3,4};
        System.out.println(search(nums,2));
    }
    public static int search(int [] nums, int target){
        if(nums == null || nums.length==0) return -1;
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right])
                left = mid+1;
            else
                right = mid;
        }
        int start = left;
        left = 0;
        right = nums.length-1;
        if(target >= left && target <= right)
            left = start;
        else right = start;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] > target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
