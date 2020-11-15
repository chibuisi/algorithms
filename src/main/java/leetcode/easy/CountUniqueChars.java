package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

public class CountUniqueChars {
    public static void main(String[] args) {
        String str = "ababa";
        long start = System.currentTimeMillis();
        int res = countChars2(str);
        long end = System.currentTimeMillis();
        System.out.println(res + " took "+ (end - start) + " ms");


    }

    private static int countChars(String str) {
        int [] chars = new int[26];
        for(char c: str.toCharArray()){
            chars[c-'a']++;
        }
        System.out.println(Arrays.toString(chars));
        int count = 0;
        for (int i = 0; i < chars.length; i++){
            if(chars[i] != 0){
                count++;
            }
        }
        return count;
    }
    private static int countChars2(String str){
        HashSet<Character> characters = new HashSet<Character>();
        for(char c : str.toCharArray()){
            characters.add(c);
        }
        return characters.size();
    }
}
