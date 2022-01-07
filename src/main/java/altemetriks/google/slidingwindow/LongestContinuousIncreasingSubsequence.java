package altemetriks.google.slidingwindow;

public class LongestContinuousIncreasingSubsequence {
    public static int solve(int [] nums){
        if(nums == null || nums.length == 0)
            return 0;
        int left = 0, right = 0, max = 0;
        while(right < nums.length){
            if(right > 0 && nums[right-1] > nums[right]){
                left = right;
            }
            right++;
            max = Integer.max(max, right - left);
        }

        return max;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,3,4,5};
        System.out.println(solve(nums));
    }
}
