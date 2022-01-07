package altemetriks.riot;

import java.util.ArrayList;
import java.util.List;

public class NextHigherPalindromicNumber {
    public static void main(String[] args) {
        System.out.println(solutionOne("35453"));//expected answer is 53435
    }
    private static boolean isPalindrome(String word){
        int left = 0;
        int right = word.length()-1;
        while(left < right){
            if(word.charAt(left++) != word.charAt(right--)){
                return false;
            }
        }
        return true;
    }

    public static String solutionOne(String str){
        int value = Integer.parseInt(str);
        String result = permutation(str, "", value, "");
        return result;
    }

    //Not working correctly with some test cases
    public static String permutation(String str, String ans, int value, String result){
        int newValue = 0;
        if(ans.length() > 0){
            newValue = Integer.parseInt(ans);
        }
        if(str.length() == 0 && isPalindrome(ans) && newValue > value){
            //System.out.println(ans);
            result = ans;
            return result;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String temp = str.substring(0,i) + str.substring(i+1);
            permutation(temp, ans+ch, value, result);
        }
        return result;
    }
}
