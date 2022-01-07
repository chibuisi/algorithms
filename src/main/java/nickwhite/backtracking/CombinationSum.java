package nickwhite.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> solve(int [] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 0, target, nums);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> temp, int start, int remaining, int[] nums) {
        if(remaining < 0)
            return;
        if(remaining == 0 && !result.contains(temp)){
            result.add(new ArrayList<>(temp));
        }
        else{
            for(int i = start; i < nums.length; i++){
                temp.add(nums[i]);
                backtrack(result, temp, i+1, remaining-nums[i], nums);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {2,4,6,3};
        int [] nums2 = {8, 2, 2, 4, 5, 6, 3};
        System.out.println(solve(nums, 6));
        System.out.println(solve(nums2, 9));
    }
}
