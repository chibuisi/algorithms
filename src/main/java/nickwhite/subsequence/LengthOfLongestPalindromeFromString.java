package nickwhite.subsequence;

public class LengthOfLongestPalindromeFromString {
    public static int solve(String s){
        if(s == null || s.length() == 0) return 0;
        int result = 0;
        int [] charCounts = new int[128];
        for(char c : s.toCharArray()){
            charCounts[c] += 1;
        }
        boolean seen = false;
        for(int i : charCounts){
            if(!seen && i % 2 == 1){
                result += i;
                seen = true;
            }
            else if(i % 2 == 0)
                result += i;
        }
        return result;
    }

    public static int solve2(String s){
        if(s == null || s.length() == 0) return 0;
        int result = 0;
        int [] charCounts = new int[128];
        for(char c : s.toCharArray()){
            charCounts[c] += 1;
        }
        for(int i : charCounts){
           result += i / 2 * 2;
           if(result % 2 == 0 && i % 2 == 1)
               result += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solve("abccccdd"));
    }
}
