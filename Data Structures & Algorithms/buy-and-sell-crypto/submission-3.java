class Solution {
    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int price: prices){
            if (price<min){
                min = price;
            } else {
                profit = Math.max(profit, price-min);
            }
        }

        return profit;
    }
}
