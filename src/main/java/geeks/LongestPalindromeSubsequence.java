package geeks;
//Leetcode 5
public class LongestPalindromeSubsequence {
    public static int solve(String str){
        if(str.isEmpty() || str == null)
            return -1;
        if(str.length() == 1)
            return 1;
        int count = 0;
        for(int i = 0; i <= str.length(); i++){
            for(int j = i; j <= str.length(); j++){
                String subStr = str.substring(i,j);
                if(isPalindrome(subStr))
                    count = Integer.max(count, subStr.length());
            }
        }
        return count;
    }
    private static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end))
                return false;
            start+=1;
            end-=1;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "ababcbab";
        System.out.println(solve(str));
    }
}
