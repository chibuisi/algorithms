package keap.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesString {
    public static String solution1(String str){
        Set<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            set.add(c);
        }
        for(char c : set){
            result.append(c);
        }
        return result.toString();
    }

    public static String solution2(String str){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(result.indexOf(String.valueOf(str.charAt(i))) == -1)
                result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1("gfg"));
        System.out.println(solution2("gfg"));
    }
}
