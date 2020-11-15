package altemetriks;

import java.util.HashSet;

public class SubPalindromeCount {
    public static void main(String[] args) {
        int count = countSubPalindromes("mokkori");
        System.out.println(count);
    }

    public static int countSubPalindromes(String str) {
        HashSet<String> distinctPalindromes = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                String substring = str.substring(i,j+1);
                if(isPalindrome(substring)){
                    distinctPalindromes.add(substring);
                }
            }
        }
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
