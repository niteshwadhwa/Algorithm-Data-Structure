public class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int lastFound = 0;
        int index = 0;
        for(int i=0;i<s.length();i++){
            
            char find = s.charAt(i);
            lastFound = t.indexOf(find,lastFound);
            if(lastFound == -1){
                return false;
            }
            lastFound++;
        }
        
        return true;
        
    }
}