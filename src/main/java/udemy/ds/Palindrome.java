package udemy.ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "?rac? 5%ecar";
        boolean res = is_palindrome(palindrome);
        System.out.println(res);
    }
    public static boolean is_palindrome(String str){
        String lowerCase = str.toLowerCase();
        Stack<Character> characterStack = new Stack<>();
        Queue<Character> characterQueue = new LinkedList<>();
        for(int i = 0; i < lowerCase.length(); i++){
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z'){
                characterStack.push(c);
                characterQueue.add(c);
            }
        }
        while(!characterStack.empty()){
            char c = characterStack.pop();
            char c2 = characterQueue.remove();
            if(c != c2){
                return false;
            }
        }
        return true;
    }
    public static boolean palindrome(String str){
        Stack<Character> characterStack = new Stack<>();
        String lowerCase = str.toLowerCase();
        StringBuilder noPunctuation = new StringBuilder();
        for(int i = 0; i < lowerCase.length(); i++){
            if(lowerCase.charAt(i) >= 'a' && lowerCase.charAt(i) <= 'z'){
                noPunctuation.append(lowerCase.charAt(i));
                characterStack.push(lowerCase.charAt(i));
            }
        }
        StringBuilder reversed = new StringBuilder();
        while (!characterStack.empty()){
            reversed.append(characterStack.pop());
        }
        return reversed.toString().equals(noPunctuation.toString());
    }
    public static boolean isPalindrome(String str){
        Stack<Character> characters = new Stack<Character>();
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < str.length(); i++){
            if(Character.isAlphabetic(lowerCase.charAt(i))){
                characters.push(lowerCase.charAt(i));
            }
        }
        int pos = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isAlphabetic(lowerCase.charAt(i))){
                char c = characters.pop();
                if(lowerCase.charAt(i) != c){
                    return false;
                }
            }
        }
        return true;
    }
}
