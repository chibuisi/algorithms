package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
        int [] nums = {2,3,6,2,7};
        int [] nums2 = {8, 2, 2, 4, 5, 6, 3};
        System.out.println(combinationSum(nums2,9));
        System.out.println(combinationSum2(nums2,9));
    }
    public static List<List<Integer>> combinationSum(int [] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(combinations, new ArrayList<>(), nums, 0, target);
        return combinations;
    }

    private static void backtrack(List<List<Integer>> combinations, List<Integer> tempList, int[] nums, int start, int remainder) {
        if(remainder < 0)
            return;
        if(remainder == 0 && !combinations.contains(tempList))
            combinations.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(combinations, tempList, nums, i+1, remainder - nums[i]);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    //Same number cannot be reused
    public static List<List<Integer>> combinationSum2(int [] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack2(combinations, new ArrayList<>(), nums, 0, target);
        return combinations;
    }

    //start position of the loop is i+1 to avoid reusing the same number
    private static void backtrack2(List<List<Integer>> combinations, List<Integer> tempList, int[] nums, int start, int remainder) {
        if(remainder < 0)
            return;
        if(remainder == 0)
            combinations.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                //avoid duplicates
                if(i < nums.length-1 && nums[i] == nums[i+1])
                    continue;
                tempList.add(nums[i]);
                backtrack2(combinations, tempList, nums, i+1, remainder - nums[i]);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
