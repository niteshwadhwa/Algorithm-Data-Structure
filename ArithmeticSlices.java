public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        
        if(A.length == 0){
            return 0;
        }
        
        for(int i=1;i<A.length;i++){
            A[i-1] = A[i-1]-A[i];
        }
        
        int count = 0;
        int sum = 0;
        for(int i=1;i<(A.length-1);i++){
            if(A[i-1] == A[i]){
                sum++;
                count = count+sum;                
            }else{
                sum = 0;
            }
        }
        
        return count;
    }
}