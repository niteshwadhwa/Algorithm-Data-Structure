public class Solution {
    public String reverseVowels(String s) {
        
        int start = 0;
        char tmp;
        int end = s.length()-1;
        StringBuilder s1 = new StringBuilder(s);
      
        while(start<end){
            while(start<=s.length()-1){
            	if(String.valueOf(s.charAt(start)).toLowerCase().matches("^[aeiou]$")){
                	break;
                }else{
                	start++;
                }
            }
            while(end>=0){
                if(String.valueOf(s.charAt(end)).toLowerCase().matches("^[aeiou]$")){
                	break;
                }else{
                	end--;
                }
            }
            if(start<end){
                tmp = s.charAt(start);
                s1.setCharAt(start, s.charAt(end));
                s1.setCharAt(end, tmp);
            }
         start++;
         end--;
            
        }
        
        return s1.toString();
    }
}