public class Solution {
    public int singleNumber(int[] nums) {
        
        int Final = 0;
        HashSet<Integer> hash = new HashSet<Integer>();
	  
	    for(int i=0;i<nums.length;i++){
		    if(hash.contains(nums[i])){
			     hash.remove(nums[i]);
		    }else{
			     hash.add(nums[i]);
		    }
	    }
	  
	    Iterator itr = hash.iterator();
	    while(itr.hasNext()){
		     Final = (int) itr.next();
		     break;
	    }
        
        return Final;
        
    }
}