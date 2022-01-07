package keap;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static String removeDuplicates(String str){
        Set<Character> set = new HashSet<>();
        for(char c : str.toCharArray()){
            set.add(c);
        }
        return String.valueOf(set);
    }

    public static String removeDuplicates2(String str){
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            if(result.indexOf(c+"") != -1)
                result.append(c);
        }
        return result.toString();
    }

    public static String removeDuplicateWords(String str){
        StringBuilder result = new StringBuilder();
        for(String s : str.split(" ")){
            if(result.indexOf(s) == -1){
                result.append(" "+s);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("book"));
        System.out.println(removeDuplicateWords("book book bot boy kid kid"));
    }
}
