public class Solution {
    public boolean isPalindrome(int x) {
       
       int j = x;
       int newInteger = 0;
       int i=10;
       
       while(x > 0){
           newInteger = newInteger*i + x%10;
           x = x/10;
       }
      
      boolean jack = (newInteger== j)?true:false;
      return jack;
      
    }
}