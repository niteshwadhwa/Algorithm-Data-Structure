public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        
        HashSet<Integer> hash = new HashSet<Integer>();
        HashSet<Integer> intersection = new HashSet<Integer>();
        
        
        for(int i = 0;i<nums1.length;i++){
            hash.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length;i++){
            if(hash.contains(nums2[i])){
                intersection.add(nums2[i]);
            }
        }
        
        Iterator itr = intersection.iterator();
        int[] intersectionArray = new int[intersection.size()];
        int j=0;
        
        while(itr.hasNext()){
            intersectionArray[j] = (int) itr.next();
            j++;
        }
        
        return intersectionArray;
        
    }
}