package dailychallenge;

public class MaxLengthOfContiguousA {
    public static int solve(String str){
        if(str == null || str.length() == 0)
            return 0;
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while(right < str.length()){
            if(str.charAt(right) != 'a'){
                right++;
                left++;
            }
            while(right < str.length() && str.charAt(right) == 'a')
                right++;
            maxLength = Math.max(maxLength, right-left);
            while(left < str.length() && str.charAt(left) == 'a')
                left++;
        }
        return maxLength;
    }



    public static void main(String[] args) {
        System.out.println(solve("baabaaaba"));
    }
}
