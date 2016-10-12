public class Solution {
    public String addStrings(String num1, String num2) {
      
      char[] longArray = num1.length() >= num2.length()?num1.toCharArray():num2.toCharArray();
      char[] shortArray = num1.length() >= num2.length()?num2.toCharArray():num1.toCharArray();
      int carry = 0;
      StringBuilder s = new StringBuilder();
      
      for(int i = longArray.length-1,j = shortArray.length-1;i>=0;i--,j--){
          int sum = 0;
          if( j >= 0){
              sum = (longArray[i] - '0') + (shortArray[j] - '0') + carry;
          }else{
              sum = (longArray[i] - '0') + carry;
          }
          if(sum > 9) {
            carry = 1;
          }else{ 
            carry = 0;
          } 
          s.append(sum % 10);
      }
      
      if(carry > 0){
          s.append(carry);
      }
      
     return s.reverse().toString();
      
        
    }
}