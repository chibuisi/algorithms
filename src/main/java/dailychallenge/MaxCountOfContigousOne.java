package dailychallenge;

public class MaxCountOfContigousOne {
    public static int solve(String str){
        int left = 0, right = 0;
        int maxCount = 0;

        while(right < str.length()){
            if(str.charAt(right) != '1'){
                right++;
                left++;
            }
            while (right < str.length() && str.charAt(right) == '1')
                right++;
            maxCount = Integer.max(maxCount, right-left);
            while (left < str.length() && str.charAt(left) == '1')
                left++;
        }
        return maxCount;
    }

    public static int solve2(String str){
        int count = 0;
        int max = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0')
                count = 0;
            else {
                count++;
                max = Integer.max(max, count);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        //System.out.println(solve("01101110111101101110"));
        System.out.println(solve2("01101110111101101110"));
    }
}
