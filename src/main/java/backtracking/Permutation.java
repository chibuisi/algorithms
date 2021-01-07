package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
//        Input: nums = [1,2,3]
//        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        int [] nums = {7,1,8};
        System.out.println(permuteIntegers(nums));
        System.out.println(permute("abc"));
    }

    public static List<List<Integer>> permuteIntegers(int [] nums){
        List<List<Integer>> permutations = new ArrayList<>();
        backtrack(permutations, new ArrayList<>(), nums);
        return permutations;
    }
    private static void backtrack(List<List<Integer>> permutations, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length)
            permutations.add(new ArrayList<>(tempList));
        else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i]))
                    continue;
                tempList.add(nums[i]);
                backtrack(permutations, tempList, nums);
                tempList.remove(tempList.size()-1);
            }
        }
    }
    public static List<List<String>> permute(String str){
        List<List<String>> permutations = new ArrayList<>();
        backtrack(permutations, new ArrayList<>(), str);
        return permutations;
    }
    private static void backtrack(List<List<String>> permutations, List<String> tempList, String str){
        if(tempList.size() == str.length())
            permutations.add(new ArrayList<>(tempList));
        else{
            for(int i = 0; i < str.length(); i++){
                String newString = String.valueOf(str.charAt(i));
                if(tempList.contains(newString))
                    continue;
                tempList.add(newString);
                backtrack(permutations,tempList,str);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
