package dailybyte.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateTextMessages {
    public static List<String> solve(String digits){
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0)
            return result;
        String [] mappings = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(0, "", mappings, digits, result);
        return result;
    }

    private static void backtrack(int index, String current, String[] mappings, String digits, List<String> result) {
        if(index == digits.length()){
            result.add(current);
            return;
        }
        String letters = mappings[digits.charAt(index) - '0'];
        for(char c : letters.toCharArray()){
            backtrack(index + 1, current+c, mappings, digits, result);
        }
    }

    public static void main(String[] args) {
        System.out.println(solve("45"));
    }
}
