class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Always keep track of the minimum price so far
            minPrice = Math.min(minPrice, price);
            // Calculate profit if we sell today
            int profit = price - minPrice;
            // Update maxProfit if it's better than previous
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
