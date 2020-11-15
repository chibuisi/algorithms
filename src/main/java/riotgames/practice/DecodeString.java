package riotgames.practice;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {

    }
    public static String decodeString(String str){
        Stack<Character> chars = new Stack<>();
        Stack<Integer> values = new Stack<>();
        String result = "";
        int index = 0;

        while(index < str.length()){
            char c = str.charAt(index);
            if(Character.isDigit(c)){
                int count = 0;
                while(Character.isDigit(str.charAt(index))){
                    count = count * 10 + (str.charAt(index)) - '0';
                    index++;
                }
                values.push(count);
            }
            if(str.charAt(index) == '['){
                chars.push(str.charAt(index));
                result = "";
                index++;
            }
            else if(str.charAt(index) == ']'){
                StringBuilder temp = new StringBuilder(chars.pop());
                int count = values.pop();
                for(int i = 0; i < count; i++){
                    temp.append(result);
                }
                result = temp.toString();
                index++;
            }
            else{
                result += str.charAt(index);
                index++;
            }
        }
        return result;
    }
}
