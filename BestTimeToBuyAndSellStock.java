public class Solution {
    public int maxProfit(int[] prices) {
        
       int maximumProfit = 0;
       if(prices.length == 0){
        return 0;
       }
       int boughtPrice = prices[0];   
       
       
       for(int i=1;i<prices.length;i++){
           if(boughtPrice > prices[i]){
               boughtPrice = prices[i];
           }else{
               if(prices[i]-boughtPrice > maximumProfit && boughtPrice < prices[i]){
                   maximumProfit = prices[i]-boughtPrice;
               }
           }
       }
        
        return maximumProfit;      
        
    }
}