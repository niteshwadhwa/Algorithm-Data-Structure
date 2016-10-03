public class Solution {
    public int strStr(String haystack, String needle) {
    
            if(haystack.equals(needle)){
                return 0;
            }else{
                if(needle.equals("")){
                    return 0;
                }else if(needle.length() > haystack.length()){
                    return -1;
                }
                int i = 0;
                for(;i<haystack.length();i++){
                    if(haystack.charAt(i) == needle.charAt(0)){
                        if(i+needle.length() <= haystack.length() && haystack.substring(i,i+needle.length()).equals(needle)){
                            return i;
                        }
                    }
                }
                return -1;
            }
    
    }
}