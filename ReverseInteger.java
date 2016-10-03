public class Solution {
    public int reverse(int x) {
       long return1 = 0;
       int sign = 1;
       if( x < 0){
           sign = -1;
           x = sign * x;
       } 
       
      while(x > 0){
            return1 = (return1*10)+(x%10);
            x = x/10; 
      }
      if(return1> Integer.MAX_VALUE || return1 < Integer.MIN_VALUE){
            return 0; 
      }else{
            return (((int)return1)*sign);
      }
        
    }
}