package altemetriks.google.slidingwindow;

public class MaximumConsecutiveOnesWithKReplacement {
    public static int solve(int [] nums, int k){
        if(nums == null || nums.length == 0)
            return 0;
        int left = 0, right = 0;

        while(right < nums.length){
            if(nums[right] == 0){
                k--;
            }
            if(k < 0){
                if(nums[left] == 0)
                    k++;
                left++;
            }
            right++;
        }

        return right-left;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,1,1,0,0,1};
        System.out.println(solve(nums,2));
    }
}
