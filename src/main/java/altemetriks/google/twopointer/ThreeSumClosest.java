package altemetriks.google.twopointer;

public class ThreeSumClosest {
    public static int solve(int [] nums, int target){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = 0 - nums[i];
            int left = i+1;
            int right = nums[nums.length-1];
            while(left < right){
                if(nums[left] + nums[right] == target){

                }
            }
        }
        return sum;
    }
}
