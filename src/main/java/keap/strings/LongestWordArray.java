package keap.strings;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordArray {
    public static String solution1(String [] words){
        String result = "";
        for(String s : words){
            if(s.length() > result.length())
                result = s;
        }
        return result;
    }

    public static String solution2(String [] words){
        return Arrays.stream(words).max(Comparator.comparing(String::length)).orElse(null);
    }

    public static void main(String[] args) {
        String [] words = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
        System.out.println(solution2(words));
    }
}
