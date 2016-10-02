public class Solution {
    public int maxRotateFunction(int[] A) {
     
        int result = 0;
        int temp = 0;
        for(int i = 0;i<A.length;i++){
            temp = temp + A[i]*i;
        }
        result = temp;
        
        int j = 0;
        int k = 0;
        int m = 0;

        for(int i=A.length-1;i>=1;i--){
            m=0;j=0;k=0;temp=0;
            j=i;
            while(j<=A.length-1){
                temp =  temp + A[j]*m;
                j++;m++;
            }
            while(k<i){
                temp =  temp + A[k]*m;
                k++;m++;
            }
            if(temp >= result){
                result = temp;
            }
        }
        return result;
    }
}