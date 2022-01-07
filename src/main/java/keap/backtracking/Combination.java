package keap.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
    public static List<List<Integer>> combinations(int [] nums, int target){
        if(nums == null || nums.length == 0)
            return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(nums, combinations, new ArrayList<>(), target, 0);
        return combinations;
    }

    public static void backtrack(int [] nums, List<List<Integer>> combinations, List<Integer> tempList, int remainder, int start){
        if(remainder < 0)
            return;
        if(remainder == 0 && !combinations.contains(tempList))
            combinations.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(nums, combinations, tempList, remainder - nums[i], i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {8, 2, 2, 4, 5, 6, 3};
        System.out.println(combinations(nums, 9));
    }
}
