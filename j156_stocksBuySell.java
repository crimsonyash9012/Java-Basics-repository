public class j156_stocksBuySell {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];
        int n = prices.length;
        for(int i=0; i<n; i++ ){
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i]-minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
