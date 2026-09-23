class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxPrice = 0;
        int ans = 0;
        for(int i = 1; i < prices.length; i++)
        {
            minPrice = Math.min(minPrice,prices[i]);
            ans = prices[i] - minPrice;
            maxPrice = Math.max(ans,maxPrice);
        }
        return maxPrice;
    }
}