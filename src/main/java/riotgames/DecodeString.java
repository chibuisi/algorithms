package riotgames;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decode(s));
    }
    public static String decode(String str){
        Stack<Integer> counts = new Stack<>();
        Stack<String> results = new Stack<>();
        String res = "";
        int index = 0;

        while(index < str.length()){
            if(Character.isDigit(str.charAt(index))){
                int count = 0;
                while(Character.isDigit(str.charAt(index))){
                    count = count * 10 + (str.charAt(index) - '0');
                    index++;
                }
                counts.push(count);
            }
            else if(str.charAt(index) == '['){
                results.push(res);
                res = "";
                index++;
            }
            else if(str.charAt(index) == ']'){
                StringBuilder temp = new StringBuilder(results.pop());
                int count = counts.pop();
                for(int i = 0; i < count; i++){
                    temp.append(res);
                }
                res = temp.toString();
                index++;
            }
            else{
                res += str.charAt(index);
                index++;
            }
        }
        return res;
    }
}
