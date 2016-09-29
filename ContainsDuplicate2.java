public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     
     HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
     
     for(int i=0;i<nums.length;i++){
         
         if(hash.containsKey(nums[i])){
             int location = hash.get(nums[i]);
             if(i - location  <= k){
                 return true;
             }else{
                 hash.put(nums[i],i);
             }
         }else{
             hash.put(nums[i],i);
         }
         
     }
     
     return false;
        
    }
}