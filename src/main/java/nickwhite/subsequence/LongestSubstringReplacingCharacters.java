package nickwhite.subsequence;

public class LongestSubstringReplacingCharacters {
    public static int solve(String str, int k){
        if(str == null || str.length() == 0) return 0;

        int left = 0;
        int right = 0;
        int maxLength = 0, maxCount = 0;
        int [] charCounts = new int[26];

        while(right < str.length()){
            charCounts[str.charAt(right)-'A']++;
            maxCount = Math.max(maxCount, charCounts[str.charAt(right)-'A']);
            while(right - left - maxCount + 1 > k)
                charCounts[str.charAt(left++)-'A']--;
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(solve("ABAB", 2));
    }
}
