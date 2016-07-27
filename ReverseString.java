public class Solution {
    public String reverseString(String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i=(s.length()-1);i>=0;i--){
            s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}