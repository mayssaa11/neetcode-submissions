class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        
        int n = prices.length;
        int current, maxCurrent;
        for (int i=0; i<n-1; i++){
            current = prices[i];
            maxCurrent = Arrays.stream(Arrays.copyOfRange(prices, i, n)).max().getAsInt();
            profit = Math.max(profit, maxCurrent-current);
        }

        return profit;
    }
}
