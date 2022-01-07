package nickwhite;

public class BestTimeToBuyAndSellStock {
    public static int solve(int [] prices){
        if(prices == null || prices.length == 0) return 0;
        int maxProfit = 0;
        int minPrice  = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice)
                minPrice = prices[i];
            if(prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{7,1,5,3,6,4}));
    }
}
