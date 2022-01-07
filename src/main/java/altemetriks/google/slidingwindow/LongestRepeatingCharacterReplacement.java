package altemetriks.google.slidingwindow;

public class LongestRepeatingCharacterReplacement {
    public static int solve(String str, int k){
        if(str == null || str.length() == 0)
            return 0;
        int left = 0, right = 0;
        int [] counts = new int[26];
        int maxCount = 0, maxLength = 0;

        while(right < str.length()){
            counts[str.charAt(right)-'A']++;
            maxCount = Integer.max(maxCount, counts[str.charAt(right)-'A']);

            while(right - left - maxCount + 1 > k){
                counts[str.charAt(left)-'A']--;
                left++;
            }
            right++;
            maxLength = Integer.max(maxLength, right - left);

        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(solve("ABAB", 2));
    }
}
