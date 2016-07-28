public class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 0;
        int max = 0;
        int majorElement = 0;
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
        
        for(int i=0;i<nums.length;i++){
            
            if(hash.containsKey(nums[i])){
                count = hash.get(nums[i]);
                count = count+1;
                hash.put(nums[i],count);
            }else{
                hash.put(nums[i],1);
            }
            
        }
        
        for(Integer hashNum : hash.keySet()){
            if(max < hash.get(hashNum)){
                max = hash.get(hashNum);
                majorElement = hashNum;
            }
        }
        
        return majorElement;
        
    }
}