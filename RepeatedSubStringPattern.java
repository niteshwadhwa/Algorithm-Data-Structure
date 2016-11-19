public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        
        boolean value = false;
        int length = str.length();
        
        if(str.length() <= 1){
            return false;
        }
        
        for(int i=1;i<=length/2;i++){
            if(length%(i) == 0){
                value = true;
                String s1 = str.substring(0, i);
                for(int j = i;j<=length-i;j=j+i){
                    if(!s1.equals(str.substring(j, j+i))){
                        value = false;
                        break;      
                    }            
                }
                if(value) return true;
            }
        }
        
        return false;
        
        
    }
}