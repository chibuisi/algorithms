package keap;

import java.util.Stack;

public class ValidateParenthesis {
    public static boolean validate(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '{' || c == '[' || c == '(')
                stack.push(c);
            if(c == '}' && !stack.isEmpty() && stack.pop() != '{')
                return false;
            if(c == ']' && !stack.isEmpty() && stack.pop() != '[')
                return false;
            if(c == ')' && !stack.isEmpty() && stack.pop() != '(')
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(validate("(({()}))"));
    }
}
