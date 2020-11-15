package riotgames.leet;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {4,1};
        System.out.println(search(nums,1));
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums, 0, nums.length-1);
        if(pivot == -1)
            return search(nums, 0, nums.length-1, target);
        if(nums[pivot] == target)
            return pivot;
        if(nums[0] >= target)
            return search(nums, pivot+1, nums.length-1, target);
        return search(nums, 0, pivot, target);
    }

    private static int findPivot(int[] nums, int start, int end) {
        if(start > end)
            return -1;
        if(start == end)
            return start;
        int mid = (start + end) / 2;
        if(mid < end && nums[mid] > nums[mid+1])
            return mid;
        if(mid > start && nums[mid] < nums[mid-1])
            return mid - 1;
        if(nums[mid] >= nums[start])
            return findPivot(nums, start, mid-1);
        return findPivot(nums, mid+1, end);
    }

    private static int search(int[]nums, int start, int end, int target){
        if(start >= end)
            return -1;
        int mid = (start + end) / 2;
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] > target)
            return search(nums,start,mid, target);
        else
            return search(nums,mid+1,end, target);
    }
}
