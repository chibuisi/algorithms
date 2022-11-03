package dailybyte2022;

import java.util.Stack;

//"(){}[]", return true
//"(({[]}))", return true
//"{(})", return false
public class ValidateBrackets {
    public static boolean solve(String braces){
        Stack<Character> stack = new Stack<>();
        for(char c : braces.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if(c == '}' && !stack.isEmpty() && stack.pop() != '{'){
                return false;
            }else if(c == ']' && !stack.isEmpty() && stack.pop() != '['){
                return false;
            }else if(c == ')' && !stack.isEmpty() && stack.pop() != '('){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solve("(){}[]"));
        System.out.println(solve("(({[]}))"));
        System.out.println(solve("{(})"));
    }
}
