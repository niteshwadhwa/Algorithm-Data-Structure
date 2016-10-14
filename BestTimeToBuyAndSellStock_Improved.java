public class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length <= 0){
            return 0;
        }
        else{
            int firstNumber = prices[0];
            int profit = 0;
            for(int i=1;i<prices.length;i++){
                if(firstNumber <= prices[i]){
                    profit = profit + ( prices[i] - firstNumber);
                    firstNumber = prices[i];
                }else{
                    firstNumber = prices[i];
                }
            }
            return profit;
        }
    }
}