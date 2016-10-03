public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int j=0;
        int i=0;
        int[] arr = new int[2];
        for(;i<nums.length;i++){
            j = i+1;
            while(j<nums.length){
                if(nums[i]+nums[j] != target){
                    j++;
                }else{
                     arr[0] = i;
                     arr[1] = j;
                     i = nums.length;
                     break;
                }
            }
        }
        
        return arr;
        
    }
}