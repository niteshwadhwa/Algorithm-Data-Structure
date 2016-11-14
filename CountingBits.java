public class Solution {
    public int[] countBits(int num) {
        
        int[] arr = new int[num+1];
        int n = 0;

        for(int i=0;i<=num;i++){
            
            n = i;
            while(n != 0){
                if((n&1) == 1){
                    arr[i] = arr[i]+1;
                }
                n = n>>1;
            }
                
        }
        
        return arr;
        
    }
}