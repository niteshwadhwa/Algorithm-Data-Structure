public class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.equals("") && t.equals("")){
            return true;
        }
        
        int match = 0;
        int j = 0;
        
        for(int i=0;i<s.length();i++){
            while(j<t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    j++;
                    match++;
                    break;
                }else{
                    j++;
                }
            }
        }
        
        if(match == s.length()){
            return true;
        }else{
            return false;
        }
        
        
        
    }
}