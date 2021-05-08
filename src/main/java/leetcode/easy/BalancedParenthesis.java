package leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {
        String data = "{((B))}";
        boolean result = isValid(data);
        int [] longest = 2 > 3 ? new int[]{4} : new int[]{2};
        System.out.println(result);
    }
    public static boolean isValid(String s) {
        Stack<Character> chars = new Stack<Character>();
        HashMap<Character,Character> charMap = new HashMap<Character, Character>();
        charMap.put('(',')');
        charMap.put('{','}');
        charMap.put('[',']');

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(charMap.containsKey(c)/*.keySet().contains(c)*/){
                chars.push(c);
            }
            else if(charMap.containsValue(c)/*.values().contains(c)*/){
                if(!chars.empty() && charMap.get(chars.peek()) == c){
                    chars.pop();
                }
                else
                    return false;
            }
        }

        return chars.empty();
    }
}
