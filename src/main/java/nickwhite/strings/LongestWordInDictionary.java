package nickwhite.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestWordInDictionary {
    public static String solve(String [] words){
        Arrays.sort(words);
        String result = "";
        Set<String> dictionary = new HashSet<>();
        for(String word : words){
            if(word.length() == 1 || dictionary.contains(word.substring(0, word.length()-1))){
                dictionary.add(word);
                if(word.length() > result.length())
                    result = word;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String [] words = {"w", "wo", "wor", "worl"};
        System.out.println(solve(words));
    }
}
