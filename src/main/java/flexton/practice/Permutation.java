package flexton.practice;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(permute("abcd"));
    }
    public static List<List<String>> permute(String str){
        List<List<String>> permutations = new ArrayList<>();
        backtrack(permutations, new ArrayList<>(), str, 0);
        return permutations;
    }

    private static void backtrack(List<List<String>> permutations, List<String> tempList, String str, int start) {
        if(tempList.size() == str.length())
            permutations.add(new ArrayList<>(tempList));
        else{
            for(int i = 0; i < str.length(); i++){
                String s = String.valueOf(str.charAt(i));
                if(tempList.contains(s))
                    continue;
                tempList.add(s);
                backtrack(permutations,tempList, str, i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
