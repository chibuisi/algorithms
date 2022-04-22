package dailybyte2022;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<String>> solution1(String str){
        List<List<String>> permutations = new ArrayList<>();
        backtrack(permutations, str,  new ArrayList<>(), 0);
        return permutations;
    }

    private static void backtrack(List<List<String>> permutations, String str, List<String> temp, int index){
        if(index == str.length())
            permutations.add(new ArrayList<>(temp));
        for(int i = 0; i < str.length(); i++){
            String newString = String.valueOf(str.charAt(i));
            if(temp.contains(newString))
                continue;
            temp.add(newString);
            backtrack(permutations, str, temp, index+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution1("abc"));
    }
}
