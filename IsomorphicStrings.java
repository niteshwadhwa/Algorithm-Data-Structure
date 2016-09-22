public class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }else if(s.length() == 0 && t.length() == 0){
            return true;
        }else{
        
            HashMap<Character, Character> hash = new HashMap<Character, Character>();
            HashMap<Character, Character> hash1 = new HashMap<Character, Character>();
        
            for(int i = 0;i<s.length();i++){
                if(hash.containsKey(s.charAt(i))){
                    Character x = hash.get(s.charAt(i));
                    if(t.charAt(i) != x){
                        return false;
                    }
                }else{
                    if(hash1.containsKey(t.charAt(i))){
                        Character x = hash1.get(t.charAt(i));
                        if(s.charAt(i) != x){
                            return false;
                        }
                    }else{
                        hash.put(s.charAt(i),t.charAt(i));
                        hash1.put(t.charAt(i),s.charAt(i));
                    }
                }
            }
        
            return true;
            
        }
    }
}