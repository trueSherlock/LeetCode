class Solution {
    public int maxProfit(int[] prices) {
        int small=Integer.MAX_VALUE,maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<small){
                small = prices[i];
            } else{
                maxProfit = Math.max(maxProfit,prices[i]-small);
            }
        }
        return maxProfit;
    }
}