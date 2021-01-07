package riotgames.practice;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {

    }
    public static String decodeString(String str){
        Stack<String> result = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        String res = "";
        int index = 0;

        while(index < str.length()){
            char c = str.charAt(index);
            if(Character.isDigit(c)){
                int count = 0;
                while(Character.isDigit(str.charAt(index))){
                    count = count * 10 + (str.charAt(index)) - '0';
                    index++;
                }
                counts.push(count);
            }
            else if(c == '['){
                result.push(res);
                res = "";
                index++;
            }
            else if(c == ']'){
                StringBuilder temp = new StringBuilder(result.pop());
                int count = counts.pop();
                for(int i = 0; i < count; i++){
                    temp.append(res);
                }
                res = temp.toString();
                index++;
            }
            else{
                res += c;
                index++;
            }
        }
        return res;
    }
}
