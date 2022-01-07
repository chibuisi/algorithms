package altemetriks.google.binarysearch;

public class FindPeakIndex {
    public static int solve(int [] nums){
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[mid+1])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,4,2,0,7,9,0};
        System.out.println(solve(nums));
    }
}
