public class Solution {
    public int minMoves(int[] nums) {
       if(nums.length == 0) return 0;
       int min = nums[0];
       for(int m: nums){
           min = Math.min(m,min);
       }
       int result = 0;
       for(int m: nums){
           result = result + m - min;
       }
       return result;
    }
}


// another approach and better approach


public class Solution {
    public int minMoves(int[] nums) {
       
       if(nums.length == 0) return 0;
       int min = nums[0];
       int result = 0;
       
       for(int i=1;i<nums.length;i++){
           
           if(nums[i] >= min){
               result = result + (nums[i] - min);
           }else{
               result = result + (min - nums[i]) * i;
               min = nums[i];
           }
           
       }
       
       return result;
       
    }
}