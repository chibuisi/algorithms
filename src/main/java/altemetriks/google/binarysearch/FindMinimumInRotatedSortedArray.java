package altemetriks.google.binarysearch;

public class FindMinimumInRotatedSortedArray {
    public static int solve(int [] nums){
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(mid > 0 && nums[mid] < nums[mid-1])
                return nums[mid];
            else if (nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }

        return nums[right];
    }

    public static void main(String[] args) {
        int [] nums = {9,3,4,5};
        System.out.println(solve(nums));
    }
}
