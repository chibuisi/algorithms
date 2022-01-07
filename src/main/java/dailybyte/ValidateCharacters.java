package dailybyte;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidateCharacters {
    public static boolean solve(String str){
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('{', '}');
        charMap.put('[', ']');
        charMap.put('(', ')');
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while(index < str.length()){
            char curr = str.charAt(index++);
            if(charMap.containsKey(curr)){
                stack.push(curr);
            }
            else if(charMap.containsValue(curr)){
                if(!stack.isEmpty() && curr != charMap.get(stack.pop())){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solve("{}([])()[(())]"));
    }
}
