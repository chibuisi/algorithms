package cci;

import java.util.HashSet;

public class StringUniqueChars {
    public static void main(String[] args) {
        boolean result = hasUniqueCars("friends");
        System.out.println(result);
    }

    public static boolean hasUniqueCars(String str){
        HashSet<Character> chars = new HashSet<>();
        for(char c : str.toCharArray()){
            chars.add(c);
        }
        return chars.size() == str.length();
    }
}
