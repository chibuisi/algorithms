package altemetriks.google.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AllPalindromeSubstring {
    public static List<List<String>> solve(String str){
        List<List<String>> palindromes = new ArrayList<>();
        backtrack(palindromes, new ArrayList<>(), 0, str);
        List<String> result = new ArrayList<>();
        palindromes.stream().forEach(e -> result.addAll(e));
        System.out.println(result);
        return palindromes;
    }

    private static void backtrack(List<List<String>> palindromes, List<String> temp, int index, String str) {
        if(index == str.length()) {
            palindromes.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index; i < str.length(); i++){
            if(isPalindrome(str, index, i)){
                temp.add(str.substring(index, i+1));
                backtrack(palindromes, temp, i+1, str);
                temp.remove(temp.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String str, int i, int j) {
        while(i < j){
            if(str.charAt(i++) != str.charAt(j--))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solve("racecar"));
    }
}
