public class Solution {
    public int climbStairs(int n) {
        int temp = 0;
        int first = 1;
        int second = 2;
        
        if(n==1){
            return 1;
        }if(n==2){
            return 2;
        }else{
            for(int i=2;i<n;i++){
                temp = first+second;
                first = second;
                second = temp;
            }
            return temp;
        }
    }
}