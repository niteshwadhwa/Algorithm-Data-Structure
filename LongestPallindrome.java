public class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> hash = new HashSet<Character>();
        int count = 0;
        
        for(int i=0;i<s.length();i++){
            if(hash.contains(s.charAt(i))){
                hash.remove(s.charAt(i));
                count++;
            }else{
                hash.add(s.charAt(i));
            }
        }
        
        if(!hash.isEmpty()){
            return ((2*count)+1);
        }
        
        return (2*count);
        
    }
    
}