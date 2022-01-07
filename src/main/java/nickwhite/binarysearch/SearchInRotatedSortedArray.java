package nickwhite.binarysearch;

public class SearchInRotatedSortedArray {
    public static int solve(int [] nums, int target){
        if(nums == null || nums.length == 0)
            return -1;
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }

        int left = 0;
        int right = nums.length-1;

        if(target >= nums[start] && target <= nums[right])
            left = start;
        else right = start;

        while (left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{4,5,6,0,1,2,3}, 5));
    }
}
