public class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length <= 1 || k<=0){
            return;
        }else{
            int temp = 0;
            k %= nums.length; // highly important specific to leet code problem
			// reverse the array, swap in first part, and then in last part
            for(int i=0,j=(nums.length-1);j > i;i++,j--){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            for(int i=0, j=k-1;j > i;i++,j--){
               temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;
            }
            
            for(int i=k, j=(nums.length)-1;j > i;i++,j--){
               temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;
            }
            
            return;
        }
    }
}