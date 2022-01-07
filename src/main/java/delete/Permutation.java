package delete;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {

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
                char c = str.charAt(i);
                if(tempList.contains(i))
                    continue;
                tempList.add(c+"");
                backtrack(permutations, tempList, str);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
