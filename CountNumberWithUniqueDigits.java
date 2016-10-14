public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
     
        if(n == 0) return 1;
        else{
            
            n = n>10?n =10:n;
            int max = 9;
            int ans = 10;
            
            for(int i=1;i<n;i++){
                max = max * (10-i);
                ans = ans + max;
            }
            
            return ans;
            
        } 
     
     
    }
}