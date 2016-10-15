// using sum

public class Solution {
    public int missingNumber(int[] nums) {
    
       int sum = nums.length;
       for(int i=0;i<nums.length;i++){
           sum = sum + i - nums[i];
       }
        
       return sum;
       
        
    }
}


// using xor


public class Solution {
    public int missingNumber(int[] nums) {
    
       int xor = nums.length;
       for(int i=0;i<nums.length;i++){
           xor = xor^i^nums[i]; 
       }
        
       return xor;
       
        
    }
}