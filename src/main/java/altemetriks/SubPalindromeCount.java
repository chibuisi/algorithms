package altemetriks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubPalindromeCount {
    public static void main(String[] args) {
        int count = countSubPalindromes(/*"mokkori"*/"tacocat");
        System.out.println(count);
    }

    public static int countSubPalindromes(String str) {
        HashSet<String> distinctPalindromes = new HashSet<>();
        int count = 0;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                String substring = str.substring(i,j+1);
                if(isPalindrome(substring)){
                    count++;
                    list.add(substring);
                    distinctPalindromes.add(substring);
                }
            }
        }
        System.out.println(list);
        System.out.println(count);
        return distinctPalindromes.size();
    }

    private static boolean isPalindrome(String substring) {
        int leftIndex = 0;
        int rightIndex = substring.length() - 1;
        while(leftIndex < rightIndex){
            if(substring.charAt(leftIndex) != substring.charAt(rightIndex)){
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
