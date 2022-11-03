package frontendsimplified;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CapitalizeSentence {
    public static String solve(String str){
        String [] array = str.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < array.length; i++){
            String s = array[i];
            if(Character.isLetter(s.charAt(0))){
                result.append(Character.toUpperCase(s.charAt(0)));
                result.append(s.substring(1));
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String solve2(String str){
        char [] chars = str.toCharArray();
        boolean prevFound = false;
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if(!prevFound && Character.isLetter(c)){
                chars[i] = Character.toUpperCase(c);
                prevFound = true;
            }
            else if(Character.isWhitespace(c) || c == '.'){
                prevFound = false;
            }
        }
        return String.valueOf(chars);
    }

    public static String solve3(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') { // You can add other chars here
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    public static String solve4(String words) {
        return Stream.of(words.trim().split("\\s"))
                .
                        filter(word -> word.length() > 0)
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(solve4("i mean to con people when they are fake. Just like Mc'donald"));
    }
}
