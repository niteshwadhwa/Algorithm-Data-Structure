public class Solution {
    public int firstUniqChar(String s) {
        
        LinkedHashMap<Character, Integer> hash = new LinkedHashMap<Character, Integer>();
        
        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i), -1);
            }else{
                hash.put(s.charAt(i), i);
            }
        }
        
        for(Character c: hash.keySet()){
            if(hash.get(c) != -1){
                return hash.get(c);
            }
        }
        
        return -1;
        
        
        
    }
}