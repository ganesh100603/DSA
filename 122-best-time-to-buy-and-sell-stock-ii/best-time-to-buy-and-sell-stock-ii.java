class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int index =1;
        while(index < prices.length){
            if(prices[index] > prices[index-1]){
                maxProfit += prices[index] - prices[index-1];
            }
            index++;
        }
        return maxProfit;

    }
}