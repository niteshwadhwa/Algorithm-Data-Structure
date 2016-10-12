public class Solution {
    public String addStrings(String num1, String num2) {
        
       int length1 = num1.length();
       int length2 = num2.length();
        
       if(length1 > length2){
          for(int i=0;i<length1-length2;i++){
              num2 = "0"+num2;
          } 
        //  num2 = String.format("%0"+length1+"s",num2);
       }else if(length2 > length1){
        //   num1 = String.format("%0"+length2+"s",num1);
         for(int i=0;i<length2-length1;i++){
            num1 = "0"+num1;
         }
       }
     
       int carry = 0;
       String result = "";
       for(int i=(num1.length()-1);i>=0;i--){
           String sum = String.valueOf((num1.charAt(i)-'0') + (num2.charAt(i)-'0') + carry);
           if(sum.length()>1){
                result = (sum.charAt(1)-'0')+result;
                carry = (sum.charAt(0)-'0');
           }else{
               result= sum+result;
               carry = 0;
           }
       }
       
       if(carry > 0){
           result= carry+result;
       }
       return result;
        
    }
}