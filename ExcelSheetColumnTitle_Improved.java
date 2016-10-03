public class Solution {
    public String convertToTitle(int n) {
        
        String title = "";
        
        if(n == 0){
            return null;
        }else{
            while(n > 0){
                char ch = (char)('A'+(n-1) % 26);
                title = ch + title;
                n = (n-1)/26;
            }
            return title;
        }
        
        
    }
}