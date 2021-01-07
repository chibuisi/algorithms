package flexton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        //input [2,3,6,7], target = 7
        //output [[2,2,3],[7]]
        int [] nums = {2,6,3,7};
        System.out.println(combinationSum(nums,7));
    }
    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        //Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }


    private static void backtrack(List<List<Integer>> combinations, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0)
            return;
        if(remain == 0)
            combinations.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(combinations, tempList, nums, remain - nums[i], i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
