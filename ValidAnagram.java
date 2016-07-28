public class Solution {
    public boolean isAnagram(String s, String t) {
     
     int count = 0;
     
     HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
     
     for(int i=0;i<s.length();i++){
         if(hash.containsKey(s.charAt(i))){
             count = hash.get(s.charAt(i));
             count = count+1;
             hash.put(s.charAt(i),count);
         }
         else{
             hash.put(s.charAt(i),1);
         }
     }
     
     for(int i=0;i<t.length();i++){
         if(!hash.containsKey(t.charAt(i))){
             return false;
         }else{
             count = hash.get(t.charAt(i));
             if(count == 1){
                 hash.remove(t.charAt(i));
             }else{
                 count = count-1;
                 hash.put(t.charAt(i),count);
             }
         }
     }
     
     
     if(!hash.isEmpty()){
         return false;
     }
     
     return true;
        
    }
}