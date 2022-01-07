package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindromes("tacocat"));
        //System.out.println(palindromes2("tacocat"));
    }
    public static List<List<String>> palindromes(String word){
        List<List<String>> palindromes = new ArrayList<>();
        backtrack(palindromes, new ArrayList<>(), word, 0);
        return palindromes;
    }

    private static void backtrack(List<List<String>> palindromes, List<String> tempList, String word, int start) {
        if(start == word.length())
            palindromes.add(new ArrayList<>(tempList));
        for(int i = start; i < word.length(); i++){
            if(isPalindrome(word,start,i)){
//                String newStr = word.substring(start,i+1);
//                if(!tempList.contains(newStr))
//                    continue;
                tempList.add(word.substring(start,i+1));
                backtrack(palindromes, tempList, word, i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    private static boolean isPalindrome(List<String> stringList) {
        int left = 0;
        int right = stringList.size() - 1;

        while (left < right){
            if(!stringList.get(left).equals(stringList.get(right)))
                return false;
        }

        return true;
    }

    private static boolean isPalindrome(String word, int left, int right) {
        while(left < right) {
            if (word.charAt(left++) != word.charAt(right--))
                return false;
        }
        return true;
    }

    public static List<String> palindromes2(String word){
        List<String> palindromes = new ArrayList<>();
        for(int i = 0; i < word.length(); i++){
            for(int j = i; j < word.length(); j++){
                String str = word.substring(i, j+1);
                if(isPalindrome(str, 0, str.length()-1))
                    palindromes.add(str);
            }
        }
        return palindromes;
    }
}
