public class Solution {
    public void moveZeroes(int[] nums) {
        
        boolean change = false;
        boolean zeroFlag =false;
        int zeroFlagLocation = 0;
        
        for(int i=0;i<nums.length;i++){
            if(!zeroFlag && nums[i] == 0){
                zeroFlag = true;
                zeroFlagLocation = i;
            }
            if(zeroFlag && nums[i] != 0){
                nums[zeroFlagLocation] = nums[i];
                nums[i] = 0;
                change = true;
                break;
            } 
        }
        if(change){
            moveZeroes(nums);
        }
    }
}