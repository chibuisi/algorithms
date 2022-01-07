package altemetriks.google;

public class BestTimeToBuyAndSell2 {
    public static int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;
        if(prices.length == 2)
            return prices[1] > prices[0] ? prices[1] - prices[0] : 0;
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            minPrice = Integer.min(minPrice, prices[i]);
            if(prices[i] > minPrice){
                maxProfit += prices[i] - minPrice;
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] prices) {
        if (prices.length==1)return 0;

        int profit = 0;

        for (int i = 1; i<prices.length; i++)
            if (prices[i-1]<prices[i])
                profit += prices[i]-prices[i-1];


        return profit;

    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4}; // expected == 7
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit2(prices));
    }
}
