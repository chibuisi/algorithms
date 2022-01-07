package dailychallenge;

import java.util.Stack;

public class DecodeString {
    public static String solve(String str){
        if(str == null || str.length() == 0)
            return str;
        Stack<String> strings = new Stack<>();
        Stack<Integer> digits = new Stack<>();
        int index = 0;
        String result = "";

        while(index < str.length()){
            char c = str.charAt(index);
            if(Character.isDigit(c)){
                int count = 0;
                while(index < str.length() && Character.isDigit(str.charAt(index))){
                    count = count * 10 + str.charAt(index) -'0';
                    index++;
                }
                digits.push(count);
            }
            else if(c == '['){
                strings.push(result);
                result = "";
                index++;
            }
            else if(c == ']'){
                StringBuilder temp = new StringBuilder(strings.pop());
                int count = digits.pop();
                for(int i = 0; i < count; i++){
                    temp.append(result);
                }
                result = temp.toString();
                index++;
            }
            else{
                result += c;
                index++;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(solve("2[a2[b]]"));
    }
}
