package nickwhite.slidingwindow;

public class SubArraysLessThanK {
    public static int solve(int [] nums, int k){
        if(nums.length <= 1) return 0;

        int result = 0;
        int prod = 1;

        int left = 0;
        int right = 0;

        while(right < nums.length){
            prod *= nums[right];

            while(prod >= k){
                prod /= nums[left++];
            }

            result += right - left + 1;
            right++;
        }


        return result;
    }

    public static void main(String[] args) {
        int [] arr = {10,5,2,6};
        int [] arr2 = {2, 4, 5, 3};
        System.out.println(solve(arr, 100));
        System.out.println(solve(arr2, 12));
    }
}
