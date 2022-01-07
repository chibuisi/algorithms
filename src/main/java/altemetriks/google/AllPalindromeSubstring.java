package altemetriks.google;

import java.util.ArrayList;
import java.util.List;

public class AllPalindromeSubstring {
    public static List<String> solve(String str){
        List<String> result = new ArrayList<>();
        if(str == null || str.length() == 0)
            return result;
        int start = 0, end = 0;
        for(int i = 0; i < str.length(); i++){
            int len = expandFromMiddle(str, i, i);
            start = i - (len - 1) / 2;
            end = i + (len / 2);
            result.add(str.substring(start,end));

            len = expandFromMiddle(str, i, i+1);
            start = i - (len - 1) / 2;
            end = i + (len / 2);
            result.add(str.substring(start,end));
        }
        return result;
    }

    private static int expandFromMiddle(String str, int left, int right) {
        if(left > right)
            return 0;
        int [] indexes = new int[2];
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {
        System.out.println(solve("racecar"));
    }
}
