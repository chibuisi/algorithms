package riotgames.practice;

import java.util.Stack;

public class BackspaceEqualStringHash {
    public static void main(String[] args) {
        System.out.println('0');
        //String S1 = "abb#c#cd#";
        //String S2 = "abe#duk###c";
        //System.out.println(areEqual(S1,S2));
    }
    public static boolean areEqual(String s1, String s2){
        String s1_edit = editHelper(s1);
        String s2_edit = editHelper(s2);
        return s1_edit.equals(s2_edit);
    }
    private static String editHelper(String s){
        Stack<Character> charStack = new Stack();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                charStack.push(c);
            }
            else if(c == '#' && !charStack.isEmpty()){
                charStack.pop();
            }
        }
        StringBuilder str = new StringBuilder();
        for(Character c : charStack){
            str.append(c);
        }
        return str.toString();
    }
}
