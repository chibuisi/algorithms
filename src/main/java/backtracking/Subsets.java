package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int [] nums = {2,3,6};
        System.out.println(allSubsets(nums));
        System.out.println(allSubsets("abc"));
    }
    public static List<List<Integer>> allSubsets(int [] nums){
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(subsets, new ArrayList<>(), nums, 0);
        return subsets;
    }

    private static void backtrack(List<List<Integer>> subsets, List<Integer> tempList, int[] nums, int start) {
        subsets.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(subsets, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }

    //Solution for no duplicates
    public static List<List<Integer>> allSubsets2(int [] nums){
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack2(subsets, new ArrayList<>(), nums, 0);
        return subsets;
    }
    //
    private static void backtrack2(List<List<Integer>> subsets, List<Integer> tempList, int[] nums, int start) {
        subsets.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            if(i < nums.length-1 && nums[i] == nums[i+1])
                continue;
            tempList.add(nums[i]);
            backtrack2(subsets, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }

    public static List<List<String>> allSubsets(String str){
        List<List<String>> subsets = new ArrayList<>();
        backtrack(subsets, new ArrayList<>(), str, 0);
        return subsets;
    }
    private static void backtrack(List<List<String>> subsets, List<String> tempList, String str, int start){
        subsets.add(new ArrayList<>(tempList));
        for(int i = start; i < str.length(); i++){
            tempList.add(String.valueOf(str.charAt(i)));
            backtrack(subsets,tempList, str, i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
