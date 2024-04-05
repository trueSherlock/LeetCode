class Solution {
    public int maxProfit(int[] prices) {
        int profitMax = 0;
        if(prices.length>1){
            int min = prices[0];
            for(int i=1;i<prices.length;i++){
                if(prices[i]-min>profitMax){
                    profitMax = prices[i]-min;
                }else if(prices[i]<min){
                    min = prices[i];
                }
            }        
        }
        return profitMax;
    }
}