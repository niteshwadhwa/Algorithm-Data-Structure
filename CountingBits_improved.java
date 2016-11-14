public class Solution {
    public int[] countBits(int num) {
        
        int[] arr = new int[num+1];
        int n = 0;

        for(int i=1;i<=num;i++){
            arr[i] = arr[i>>1] + (i&1);   
        }
        
        return arr;
        
    }
}