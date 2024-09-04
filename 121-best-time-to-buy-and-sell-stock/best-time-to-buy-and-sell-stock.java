class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],n=prices.length;
        int profit=0;
        for(int i=1;i<n;i++){
            int cp=prices[i]-min;
            profit=Math.max(profit,cp);
            min=Math.min(min,prices[i]);

        }
    return profit;
    }
}
