package hackerrank2022;

import java.util.HashMap;
import java.util.Map;

public class NumWordsInStringByCamelCase {
    public static int solve(String s){
//        boolean lowercase = true;
//        boolean uppercase = true;
//        boolean digits = true;
//        boolean symbols = true;
        int req = 4;
        boolean [] reqChecks = new boolean[4];
        Map<Character, Character> symbols = new HashMap<>();
        String allSymbols = "!@#$%^&*()-+";
        for(char c : allSymbols.toCharArray())
            symbols.put(c,c);
        for(char c : s.toCharArray()){
            if(req > 0 && !reqChecks[0] && ('a' <= c && c <= 'z')){
                reqChecks[0] = true;
                req--;
            }
            if(req > 0 && !reqChecks[1] && ('A' <= c && c <= 'Z')){
                reqChecks[1] = true;
                req--;
            }
            if(req > 0 && !reqChecks[2] && Character.isDigit(c)){
                reqChecks[2] = true;
                req--;
            }
            if(req > 0 && !reqChecks[3] && symbols.containsKey(c)){
                reqChecks[3] = true;
                req--;
            }
            if(req == 0)
                break;
        }
        if(s.length() == 6)
            return req;
        if(s.length() > 6)
            return req;
        else {
            return req + (6 - (s.length()+req));
        }
    }

    public static void main(String[] args) {
        System.out.println(solve("bbb")); //3
        System.out.println(solve("2bb")); //3
        System.out.println(solve("2b")); //4
        System.out.println(solve("")); //6
        System.out.println(solve("hT2hhh")); //1
        System.out.println(solve("hT2hhh#")); //0
    }
}
