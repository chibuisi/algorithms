package nickwhite.subsequence;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int solve(String s){
        if(s == null || s.length() == 0)
            return 0;
        int left = 0, right = 0, max = 0;
        Set<Character> characterSet = new HashSet<>();

        while(right < s.length()){
            if(!characterSet.contains(s.charAt(right))){
                characterSet.add(s.charAt(right));
                right++;
                max = Math.max(characterSet.size(), max);
            }
            else{
                characterSet.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solve("ababcabc"));
    }
}

/*

abbabababmcjenc




 */