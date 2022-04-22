package dailybyte2022;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> solution1(int [] nums, int k){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<>(), k, 0);
        return result;
    }
    private static void backtrack(int [] nums, List<List<Integer>> combinations, List<Integer> temp, int remainder, int start){
        if(remainder < 0)
            return;
        if(remainder == 0)
            combinations.add(new ArrayList<>(temp));
        else{
            for(int i = start; i < nums.length; i++){
                temp.add(nums[i]);
                backtrack(nums, combinations, temp, remainder - nums[i], i+1);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,2,4,6,3};
        System.out.println(solution1(nums,6));
    }
}
