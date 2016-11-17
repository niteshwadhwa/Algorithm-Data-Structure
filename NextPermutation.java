public class Solution {
    public void nextPermutation(int[] nums) {
       
        // Search from last where nums[i] > nums[i-1], if found, again search from last and check which first number if greater than nums[i-1] and replace, and then reverse the numbers from nums[i-1] to nums.length-1
       
        
        int i = nums.length - 1;
        
        for(;i>0;i--){
            if(nums[i] > nums[i-1]){
                break;
            }
        }
        
        if(i != 0){
            for(int j=nums.length-1;j>=i;j--){
                if(nums[j] > nums[i-1]){
                    int temp = nums[j];
                    nums[j] = nums[i-1];
                    nums[i-1] = temp;
                    break;
                }
            }
        }
        
        
        int j = nums.length - 1;
        
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
       
    }
}