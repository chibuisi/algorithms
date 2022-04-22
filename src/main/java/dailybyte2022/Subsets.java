package dailybyte2022;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<String>> solution1(String str){
        List<List<String>> subsets = new ArrayList<>();
        backtrack(subsets, str, new ArrayList<>(), 0);
        return subsets;
    }

    public static void backtrack(List<List<String>> permutations, String str, List<String> temp, int index){
        permutations.add(new ArrayList<>(temp));
        for(int i = index; i < str.length(); i++){
            temp.add(String.valueOf(str.charAt(i)));
            backtrack(permutations,str, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution1("abc"));
    }
}
