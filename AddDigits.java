public class Solution {
    public int addDigits(int num) {
        
        int sum = 0;
        String num1 = String.valueOf(num);
        
        if(num1.length()>1){
            for(int i=0;i<num1.length();i++){
                sum = sum+Integer.parseInt(String.valueOf(num1.charAt(i)));
            }
            return addDigits(sum);
        }else{
            return num;
        }
        
    }
}