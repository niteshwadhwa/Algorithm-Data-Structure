public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        if(nums.length == 1){
            return nums[0];
        }
        
        int max_profit[] = new int[nums.length];
        
        max_profit[0] = nums[0];
        //System.out.println(nums[0]);
        max_profit[1] = Math.max(nums[0],nums[1]);
        //System.out.println(nums[1]);
        
        for(int i=2;i<nums.length;i++){
            
            //System.out.println("add nums[i-2] = "+max_profit[i-2]+" and nums[i]= "+nums[i]+" = "+(nums[i-2]+nums[i]));
            
            max_profit[i] = Math.max(max_profit[i-2]+nums[i],max_profit[i-1]);
            
        }
        
        return max_profit[nums.length-1];
        
        
    }
}