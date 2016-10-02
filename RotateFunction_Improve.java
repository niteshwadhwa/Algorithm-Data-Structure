public class Solution {
    public int maxRotateFunction(int[] A) {
     
        int result = 0;
        int temp = 0;
        int sum = 0;
        for(int i = 0;i<A.length;i++){
            temp = temp + A[i]*i;
            sum = sum+A[i];
        }
        result = temp;

        for(int i=1;i<A.length;i++){
            temp = temp + sum - (A.length)*A[A.length - i];
            result = Math.max(temp,result);
        }
       
       return result;
    }
}