package nickwhite;

//Leetcode 775
public class GlobalAndLocalInversions {
    //find a global that is not a local inversion [1,2,0,5,3,4]
    public static boolean solve(int [] nums){
        int max = -1;
        for(int i = 0; i < nums.length-2; i++){
            max = Integer.max(max, nums[i]);
            if(max > nums[i])
                return false;
        }
        return true;
    }
}
