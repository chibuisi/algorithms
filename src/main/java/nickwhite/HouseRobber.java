package nickwhite;

public class HouseRobber {
    //max money to get from robbing houses
    public static int solve(int [] houses){
        int [] dp = new int[houses.length+1];
        dp[0] = 0;
        dp[1] = houses[0];

        for(int i = 1; i < houses.length; i++){
            dp[i+1] = Integer.max(dp[i], dp[i-1] + houses[i]);
        }

        return dp[houses.length];
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        System.out.println(solve(arr));
    }
}
