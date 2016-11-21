public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        
        int mid = nums.length/2;
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i] < nums[mid]){
                count = count + nums[mid]-nums[i];
            }else if(nums[i] > nums[mid]){
                count  = count + nums[i] - nums[mid];
            }
            
        }
        
        return count;
    }
}