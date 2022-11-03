package frontendsimplified;

public class StockTrading {
    public static int solve(int [] prices){
        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = prices[0];
        for(int i = 0; i < prices.length; i++){
            if(buyPrice > prices[i])
                buyPrice = prices[i];
            else if(maxProfit < prices[i] - buyPrice)
                maxProfit = prices[i] - buyPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{7, 1, 5, 3, 6, 4}));//output 5
    }
}
