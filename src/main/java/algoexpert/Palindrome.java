package algoexpert;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(pointerIsPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        StringBuilder reverseStr = new StringBuilder(str);
        String reverse = reverseStr.reverse().toString();
        return reverse.equals(str);
    }

    public static boolean recursiveIsPalindrome(String str){
        if(str.length() == 0)
            return false;
        return str.charAt(0) == str.charAt(str.length()-1) && recursiveIsPalindrome(str.substring(0,str.length()/2));
    }
    public static boolean pointerIsPalindrome(String str){
        int startIndex = 0;
        int endIndex = str.length()-1;
        while(startIndex < endIndex){
            if(str.charAt(startIndex) != str.charAt(endIndex)){
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}
