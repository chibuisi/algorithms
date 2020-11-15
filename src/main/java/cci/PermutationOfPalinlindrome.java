package cci;

import java.util.HashMap;
import java.util.Map;

public class PermutationOfPalinlindrome {
    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("Tact Coaa"));
    }

    public static boolean isPermutationOfPalindrome(String phrase){

        Map<Character,Integer> numChars = new HashMap<>();
        for(char c : phrase.toLowerCase().toCharArray()){
            if(!Character.isAlphabetic(c))
                continue;
            if(numChars.containsKey(c))
                numChars.put(c,numChars.get(c)+1);
            else
                numChars.put(c,1);
        }
        boolean found = false;
        for(Integer num : numChars.values()){
            if(num % 2 == 1){
                if(found)
                    return false;
                found = true;
            }
        }
        return true;
    }

    public static int getCharnumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if(a <= val && val <= z){
            return val - a;
        }
        return -1;
    }
}
