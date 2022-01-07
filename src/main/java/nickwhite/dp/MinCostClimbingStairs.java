package nickwhite.dp;

public class MinCostClimbingStairs {
    public static int solve(int [] nums){
        int step1 = 0;
        int step2 = 0;
        for(int i = 0; i < nums.length; i++){
            step2 = step1;
            step1 = nums[i] + Integer.min(step1,step2);
        }
        return Integer.min(step1,step2);
    }

    public static void main(String[] args) {

    }
}
