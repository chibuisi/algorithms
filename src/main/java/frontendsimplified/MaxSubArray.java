package frontendsimplified;

public class MaxSubArray {
    public static int solve(int [] nums){
        int n = nums.length;
        int maximumSubArraySum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for (int left = 0; left < n; left++) {

            int runningWindowSum = 0;

            for (int right = left; right < n; right++) {
                runningWindowSum += nums[right];

                if (runningWindowSum > maximumSubArraySum) {
                    maximumSubArraySum = runningWindowSum;
                    start = left;
                    end = right;
                }
            }
        }
        return maximumSubArraySum;
    }

    public static int solve2(int [] array){
        int maxSum = array[0];
        for(int i = 1; i < array.length; i++){
            array[i] = Integer.max(array[i], array[i-1] + array[i]);
            maxSum = Integer.max(array[i], maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int [] array = {-3,1,-8,4,-1,2,1,-5,5};//result = 6
        int [] array2 = {5,4,-1,7,8};//result = 23
        int [] array3 = {1};//result = 1
        System.out.println(solve(array));
    }
}
