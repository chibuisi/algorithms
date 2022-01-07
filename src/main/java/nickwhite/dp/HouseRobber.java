package nickwhite.dp;

public class HouseRobber {
    public static int solve(int [] houses){
        if(houses == null || houses.length == 0) return 0;
        int [] dp = new int[houses.length+1];
        dp[0] = 0;
        dp[1] = houses[0];

        for(int i = 1; i < houses.length; i++){
            dp[i+1] = Integer.max(dp[i], dp[i-1] + houses[i]);
        }

        return dp[dp.length-1];
    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,1,5}; // expected 4
        System.out.println(solve(arr));
    }
}
