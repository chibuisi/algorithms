package msx;

public class CountPalindromes {
    public static void main(String[] args) {
        System.out.println(countPalindrome("tacocat"));
    }
    public static int countPalindrome(String str){
        int count = 0;
        if(str.isEmpty())
            return count;
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                String subString = str.substring(i,j+1);
                if(isPalindrome(subString))
                    count++;
            }
        }
        return count;
    }
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
