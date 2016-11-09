public class Solution {
    public void sortColors(int[] nums) {
      
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            
            while(start <= end && nums[start] == 0){
                start++;
            }
            
            while(start <= end && nums[end] != 0){
                end--;
            }
            
            if(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }else{
                break;
            }
            
        }
       
        start = 0;
        end = nums.length-1;
        while(start <= end){
            
            while(start <= end && (nums[start] == 0 || nums[start] == 1)){
                start++;
            }
            
            while(start <= end && nums[end] == 2){
                end--;
            }
            
            if(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }else{
                break;
            }
            
        }
       
        
    }
}