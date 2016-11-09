public class Solution {
    public void sortColors(int[] nums) {
      
       int j = 0, k = nums.length-1;
       int temp = 0;
       
       for(int i=0;i<=k;i++){
           if(nums[i] == 0){
               temp = nums[j]; nums[j] = nums[i]; nums[i] = temp; j++;
           }else if(nums[i] == 2){
               temp = nums[i]; nums[i] = nums[k]; nums[k] = temp; i--; k--;
           }
       }
       
    }
    
}