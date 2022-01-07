package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
//        Input: nums = [1,2,3]
//        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        int [] nums = {7,1,8};
        System.out.println(permute(nums));
        System.out.println(permute("abc"));
        //System.out.println(permuteString2("abc"));
    }

    public static List<List<Integer>> permute(int [] nums){
        List<List<Integer>> permutations = new ArrayList<>();
        backtrack(permutations, new ArrayList<>(), nums);
        return permutations;
    }
    private static void backtrack(List<List<Integer>> permutations, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length)
            permutations.add(new ArrayList<>(tempList));
        for(int i = 0; i < nums.length; i++){
            if(tempList.contains(nums[i]))
                continue;
            tempList.add(nums[i]);
            backtrack(permutations, tempList, nums);
            tempList.remove(tempList.size()-1);
        }
    }
    public static List<List<String>> permute(String str){
        List<List<String>> permutations = new ArrayList<>();
        backtrack(permutations, new ArrayList<>(), str, 0);
        return permutations;
    }
    private static void backtrack(List<List<String>> permutations, List<String> tempList, String str, int index){
        if(index == str.length())
            permutations.add(new ArrayList<>(tempList));
        for(int i = 0; i < str.length(); i++){
            String newString = String.valueOf(str.charAt(i));
            if(tempList.contains(newString))
                continue;
            tempList.add(newString);
            backtrack(permutations,tempList,str, index + 1);
            tempList.remove(tempList.size()-1);
        }
    }

    /*public static List<String> permuteString2(String str){
        List<String> result = new ArrayList<>();
        backtrackString(result, "", str, 0);
        return result;
    }

    private static void backtrackString(List<String> strings, String temp, String input, int index){
        if(index == input.length()) {
            strings.add(temp);
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (temp.indexOf(c) != -1)
                continue;
            temp += c;
            backtrackString(strings, temp, input.substring(0,i)+input.substring(i), index+1);
            input.substring(0, temp.length()-1);
        }
    }*/
}
