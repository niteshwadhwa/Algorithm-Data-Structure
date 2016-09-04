public class Solution {
    
    public int[] plusOne(int[] digits) {
       
       int length = digits.length;
       if(digits[length-1] != 9){
           digits[length-1] = digits[length-1] + 1;
           return digits;
       }else{
        for(int i=length-1;i>=0;i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i] = digits[i]+1;
                return digits;
            }
        }
        int[] newArray = new int[digits.length+1];
        newArray[0] = 1;
        return newArray;
       }
       
    }
    
}