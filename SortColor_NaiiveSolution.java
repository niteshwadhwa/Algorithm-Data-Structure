public class Solution {
    public void sortColors(int[] nums) {
        
        TreeSet<Integer> arr = new TreeSet<Integer>();
        int start = 0, end = nums.length-1;
        
        while(start <= end){
            
            if(nums[start] == 0 && arr.size() == 0){
                 start++;
            }else if(nums[start] == 0 && arr.size() > 0){
                int temp1= arr.pollFirst();
                nums[temp1] = 0;
                nums[start] = 1;
                arr.add(start);
                start++;
            }else if(nums[start] == 1){
                arr.add(start);
                start++;
            }else if(nums[start] == 2 && nums[end] != 2){
                
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                
                if(nums[start] != 0){
                    arr.add(start);
                    start++;
                }else if(nums[start] == 0 && arr.size() > 0){
                    int temp1= arr.pollFirst();
                    nums[temp1] = 0;
                    nums[start] = 1;
                    arr.add(start);
                    start++;
                }else{
                    start++;
                }
                
            }else{
                end--;
            }
            
        }
        
        
    }
    
    
    
}