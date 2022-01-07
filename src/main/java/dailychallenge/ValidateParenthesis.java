package dailychallenge;

import java.util.Stack;

public class ValidateParenthesis {
    public static boolean solve(String str){
        if(str == null || str.length() == 0) return true;
        Stack<Character> characterStack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(c == '{' || c == '[' || c == '(')
                characterStack.push(c);
            else if(!characterStack.isEmpty() && c == '}' && characterStack.peek() == '{')
                characterStack.pop();
            else if(!characterStack.isEmpty() && c == ']' && characterStack.peek() == '[')
                characterStack.pop();
            else if(!characterStack.isEmpty() && c == ')' && characterStack.peek() == '(')
                characterStack.pop();
        }
        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solve("()()"));
    }
}
