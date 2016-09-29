public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int k = nums1.length - 1;
        while(m>0 && n>0){
            if(nums1[m-1] >= nums2[n-1]){
                nums1[k] = nums1[m-1];
                m = m-1;
            }else{
                nums1[k] = nums2[n-1];
                n = n-1;
            }
            k--;
        }
        
        if(n>0){
            for(int i=n;i>0;i--){
                nums1[i-1] = nums2[i-1];
            }
        }
        
    }
}