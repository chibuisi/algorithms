package altemetriks.riot;

public class SimpleMaxDifference {
    public static int solve(int [] nums){
        int min = nums[0];
        int maxDiff = Integer.MIN_VALUE;

        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            int currDiff = curr - min;
            maxDiff = Integer.max(maxDiff, currDiff);
            min = Integer.min(min, curr);
        }

        return maxDiff == Integer.MIN_VALUE ? -1 : maxDiff;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,6,4}; //expected 5
        System.out.println(solve(nums));
    }
}
