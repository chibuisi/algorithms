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

        int [] arr = {1,2,3,1,5}; // expected 9
        int [] arr2 = {2,7,9,3,1}; // expected 12
        int [] arr3 = {1,2,3,1}; // expected 4
        int [] arr4 = {2,1,1,2}; // expected 4
        int [] arr5 = {-3,1,-8,4,-1,2,1,-5,5};
        System.out.println(solve(arr));
        System.out.println(solve(arr2));
        System.out.println(solve(arr3));
        System.out.println(solve(arr4));
        System.out.println(solve(arr5));
    }
}
