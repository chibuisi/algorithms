package altemetriks.riot;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(solutionOne("Solution"));
        System.out.println(solutionTwo("Solution"));
        System.out.println(solutionThree("Solution"));
        System.out.println(solutionFour("Solution"));
    }
    public static String solutionOne(String str){
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }

    public static String solutionTwo(String str){
        String result = "";
        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

    public static String solutionThree(String str){
        Stack<Character> characterStack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            characterStack.push(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while(!characterStack.isEmpty()){
            result.append(characterStack.pop());
        }
        return result.toString();
    }

    public static String solutionFour(String str){
        if(str.isEmpty())
            return str;
        return solutionFour(str.substring(1)) + str.charAt(0);
    }
}
