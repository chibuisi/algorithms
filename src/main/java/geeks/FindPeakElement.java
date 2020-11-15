package geeks;

public class FindPeakElement {
    public static void main(String[] args) {
        int [] nums = {1,3,20,4,1,0,7};
        System.out.println(findPeak(nums));
    }
    public static int findPeak(int [] nums){
        return findPeak(nums, 0, nums.length-1);
    }

    private static int findPeak(int [] nums, int start, int end){
        int n = nums.length;
        int mid = (start + end) / 2;
        if((mid == 0 || nums[mid] > nums[mid + 1]) && (mid == n-1 || nums[mid] > nums[mid-1]))
            return mid;
        if(mid > 0 && nums[mid] < nums[mid-1])
            return findPeak(nums,start,mid-1);
        else
            return findPeak(nums, mid+1, end);
    }
}
