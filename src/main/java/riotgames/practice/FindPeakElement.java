package riotgames.practice;

public class FindPeakElement {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2,3};
        System.out.println(findPeak(nums));
    }
    public static int findPeak(int [] nums){
        return findPeak(nums, 0, nums.length-1);
    }
    private static int findPeak(int [] nums, int start, int end){
        if(start > end) return -1;
        int mid = start + (end - start) / 2;
        if(mid == 0 || nums[mid] >= nums[mid-1] && mid == nums.length-1 || nums[mid] >= nums[mid+1])
            return mid;
        if(mid - 1 > 0 && nums[mid] > nums[mid-1])
            return findPeak(nums, start, mid - 1);
        else
            return findPeak(nums, mid+1, end);
    }
}
