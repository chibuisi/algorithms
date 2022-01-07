package altemetriks.google;

public class BestTimeToBuyAndSell {
    public static int solve(int [] prices){
        int minPrice = prices[0];
        int maxProfit = Integer.MIN_VALUE;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
            if(prices[i] < minPrice)
                minPrice = prices[i];
        }

        return maxProfit == Integer.MIN_VALUE ? -1 : maxProfit;
    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4}; //expected 5
        System.out.println(solve(prices));
    }
}
