package Array;

public class StockBuyAndSell {
    public static int maxProfit(int[] prices) {
        int n= prices.length;
        int buy =  prices[0];
        int profit = 0;
        int maxProfit = 0;
        for(int i =1;i<n;i++){
            profit =prices[i]- buy ;
            buy = Math.min(buy,prices[i]);
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[]  prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }
}
