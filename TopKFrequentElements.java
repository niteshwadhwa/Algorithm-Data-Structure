public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
       HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
       
       for(int i=0;i<nums.length;i++){
           int count = hash.getOrDefault(nums[i],0) + 1;
           hash.put(nums[i],count);
       }
    
       TreeMap<Integer, List<Integer>> tree = new TreeMap<Integer, List<Integer>>();
       
       for(int n : hash.keySet()){
          int value = hash.get(n);
          if(!tree.containsKey(value)){
              tree.put(value,new LinkedList<>());
          }
          tree.get(value).add(n);
       }
       
       List<Integer> list = new LinkedList<Integer>();
       while(list.size() != k){
            list.addAll(tree.pollLastEntry().getValue());
       }
       
       return list;
       
        
        
    }
}