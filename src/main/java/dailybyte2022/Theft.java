package dailybyte2022;

import java.util.Arrays;

public class Theft {
    public static int solution1(int [] houses){
        int [] dp = new int[houses.length+1];
        dp[0] = 0;
        dp[1] = houses[0];
        for(int i = 1; i < houses.length; i++){
            dp[i+1] = Integer.max(dp[i], dp[i-1] + houses[i]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        int [] houses = {1,3,2,5,2};
        System.out.println(solution1(houses));
    }
}
