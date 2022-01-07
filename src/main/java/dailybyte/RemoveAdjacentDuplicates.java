package dailybyte;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    public static String solve(String str){
        Stack<Character> stack = new Stack<>();
        int index = 1;
        stack.push(str.charAt(0));
        while(index < str.length()){
            char c = str.charAt(index++);
            if(!stack.isEmpty() && stack.peek() != c)
                stack.push(c);
            else if(!stack.isEmpty())
                stack.pop();
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty())
             result.insert(0,stack.pop());
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(solve("atmnbcaabbccc"));
    }
}
