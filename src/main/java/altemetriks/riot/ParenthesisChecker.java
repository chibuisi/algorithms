package altemetriks.riot;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        System.out.println(solutionOne("{{}}[]()(){"));
    }
    public static boolean solutionOne(String str){
        Map<Character, Character> chars = new HashMap<>();
        chars.put('(', ')');
        chars.put('{', '}');
        chars.put('[', ']');
        Stack<Character> characterStack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(chars.containsKey(ch)){
                characterStack.push(ch);
            }
            else if(chars.containsValue(ch) && !characterStack.isEmpty() && chars.get(characterStack.peek()) == ch){
                characterStack.pop();
            }
        }

        return characterStack.isEmpty();
    }
}
