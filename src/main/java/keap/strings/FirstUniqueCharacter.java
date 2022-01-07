package keap.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacter {
    public static String solution1(String str){
        Map<Character, Integer> counts = new HashMap<>();
        for(char c : str.toCharArray()){
            counts.put(c, counts.getOrDefault(c, 0)+1);
        }
        return counts.entrySet().stream()
                .filter(entry -> (int) entry.getValue() == 1)
                .findFirst()
                .map(entry -> entry.getKey()+"")
                .orElse(null);
    }

//    public static String solution2(String str){
//
//    }

    public static void main(String[] args) {
        System.out.println(solution1("abcda"));
    }
}
