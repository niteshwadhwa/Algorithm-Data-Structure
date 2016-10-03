public class Solution {
    public boolean isPalindrome(String s) {
        if(s== null || s.length() <= 1){
            return true;
        }else{
           int j = s.length()-1;
           for(int i=0;i<j;i++){
               
               if(String.valueOf(s.charAt(i)).matches("^[a-zA-Z0-9]*$")){
                   while( i < j && !String.valueOf(s.charAt(j)).matches("^[a-zA-Z0-9]*$")){
                       j--;
                   }
                   if(i < j){
                       if(!String.valueOf(s.charAt(i)).equalsIgnoreCase(String.valueOf(s.charAt(j)))){
                           return false;
                       }
                       j--;
                   }
               }   
           }
           return true;
           
        }
        
    }
}