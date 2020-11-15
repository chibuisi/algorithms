package riotgames.practice;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {

    }
    public static boolean isBalanced(String str){
        Stack<Character> characters = new Stack<>();
        HashMap<Character,Character> charMap = new HashMap<>();
        charMap.put('(',')');
        charMap.put('{','}');
        charMap.put('[',']');

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(charMap.containsKey(c)){
                characters.push(c);
            }
            else{
                if(charMap.containsValue(c) && charMap.get(characters.peek()) == c){
                    characters.pop();
                }
                else
                    return false;
            }
        }

        return characters.isEmpty();
    }
}
