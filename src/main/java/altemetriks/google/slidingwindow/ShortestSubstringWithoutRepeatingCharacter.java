package altemetriks.google.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class ShortestSubstringWithoutRepeatingCharacter {
    public static int solve(String str){
        if(str == null || str.length() == 0)
            return 0;
        int left = 0, right = 0, max = 0;
        Set<Character> uniqueChars = new HashSet<>();

        while(right < str.length()){
            char c = str.charAt(right);
            if(!uniqueChars.contains(c)){
                uniqueChars.add(c);
                max = Integer.max(max, uniqueChars.size());

            } else {
                uniqueChars.remove(left);
                left++;
            }
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solve("abccd"));
    }
}
