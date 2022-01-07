package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

public class CountUniqueChars {
    public static void main(String[] args) {
        String str = "ababazgtavwopamljsguigdebkjhdihiebkjnoichjoiehihbeifdceddssd";
        long start = System.currentTimeMillis();
        int res = countChars(str);
        long end = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        int res2 = countChars2(str);
        long end2 = System.currentTimeMillis();
        long start3 = System.currentTimeMillis();
        int res3 = countChars3(str);
        long end3 = System.currentTimeMillis();
        System.out.println(res + " took "+ (end - start) + " ms");
        System.out.println(res2 + " took "+ (end2 - start2) + " ms");
        System.out.println(res3 + " took "+ (end3 - start3) + " ms");


    }

    private static int countChars(String str) {
        int [] chars = new int[26];
        for(char c: str.toCharArray()){
            chars[c-'a']++;
        }
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
    public static int countChars3(String str){
        return (int) str.chars().distinct().count();
    }
}
