package keap.strings;

import java.util.Stack;

public class ReverseStrings {
    public static String solution1(String str){
        String result = "";
        for(int i = str.length() - 1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    public static String solution2(String str){
        StringBuilder result = new StringBuilder(str);
        return result.reverse().toString();
    }

    public static String solution3(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            stack.push(c);
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            char c = stack.pop();
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution3("friends"));
    }
}
