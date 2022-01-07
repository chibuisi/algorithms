package altemetriks.google.slidingwindow;

public class SubArrayProductLessThanK {
    public static int solve(int [] nums, int k){
        if(nums == null || nums.length == 0)
            return 0;
        int left = 0, right = 0, result = 0;
        int prod = 1;

        while(right < nums.length){
            prod *= nums[right];

            while(prod >= k){
                prod /= nums[left];
                left++;
            }

            result += right - left + 1;
            right++;
        }

        return result;
    }
}
