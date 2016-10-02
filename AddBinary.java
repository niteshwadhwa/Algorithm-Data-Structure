public class Solution {
    public String addBinary(String a, String b) {
        
        int lengthA = a.length()-1;
        int lengthB = b.length()-1;
        int A = 0;
        int B = 0;
        int carry = 0;
        String sum ="";
        
        while(lengthA >= 0 || lengthB >= 0){
            if(lengthA>=0){
                A = Character.getNumericValue(a.charAt(lengthA));
                lengthA--;
            }
            if(lengthB>=0){
                B = Character.getNumericValue(b.charAt(lengthB));
                lengthB--;
            }
            if(A+B+carry == 3){
                sum = '1'+ sum ;
                carry = 1;
            }else if(A+B+carry == 2){
                sum = '0'+ sum;
                carry = 1;
            }else if(A+B+carry == 1){
                sum = '1'+ sum;
                carry = 0;
            }else{
                sum = '0'+sum;
                carry = 0;
            }
            A=0;
            B=0;
        }
        
        if(carry > 0){
            sum = '1'+sum;
        }
        return sum;
        
    }
}