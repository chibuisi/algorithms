package geeks;

import java.util.Arrays;

//Input: S = “geeksforgeeks”
//Output: feeggkokreess
//Input: S = “apple”
//Output: alppe
public class SortStringWithoutSortingVowels {

    public static void main(String[] args) {
        System.out.println(testTrue1("geeksforgeeks"));
        System.out.println(testTrue2("apple"));
    }

    public static String solve(String str){
        String vowels = "aeiou";
        char [] consonants = new char[str.length()];
        int index = 0;
        for(char ch : str.toCharArray()){
            if(vowels.indexOf(ch+"") == -1){
                consonants[index] = ch;
                index++;
            }
        }
        Arrays.sort(consonants);
        StringBuilder result = new StringBuilder();
        index = 0;
        for(char c : consonants){
            if(c == 0){
                index++;
            }
            else
                break;
        }
        for(char ch : str.toCharArray()){
            if(vowels.indexOf(ch+"") == -1){
                result.append(consonants[index]);
                index+=1;
            }
            else
                result.append(ch);
        }
        return result.toString();
    }

    public static boolean testTrue1(String str){
        String actual = solve(str);
        String expected = "feeggkokreess";
        return actual.equals(expected);
    }

    public static boolean testTrue2(String str){
        String actual = solve(str);
        String expected = "alppe";
        return actual.equals(expected);
    }
}
