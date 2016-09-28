public class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        HashMap<Character, String> hash = new HashMap<Character, String>();
        HashMap<String, Character> hash1 = new HashMap<String, Character>();
        String[] splited = str.split(" ");

        if(splited.length != pattern.length()){
            return false;
        }

        for(int i=0;i<pattern.length();i++){
           
           if(hash.containsKey(pattern.charAt(i))){
                String s = hash.get(pattern.charAt(i));
                if(!s.equals(splited[i])){
                    return false;
                }
           }
           if(hash1.containsKey(splited[i])){
               char s = hash1.get(splited[i]);
               if(s != pattern.charAt(i)){
                   return false;
               }
           }
           
           hash.put(pattern.charAt(i), splited[i]);
           hash1.put(splited[i], pattern.charAt(i));
           
        }
        
        return true;
        
    }
}