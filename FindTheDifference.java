public class Solution {
    public char findTheDifference(String s, String t) {
     
        HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
        Character Final = null;
        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                int count = hash.get(s.charAt(i));
                count = count+1;
                hash.put(s.charAt(i),count);
            }else{
                hash.put(s.charAt(i),1);
            }
        }
        
        for(int i=0;i<t.length();i++){
            if(hash.containsKey(t.charAt(i))){
                int count = hash.get(t.charAt(i));
                if(count > 1){
                    count = count-1;
                    hash.put(t.charAt(i),count);
                }else{
                    hash.remove(t.charAt(i));
                }
            }else{
                Final = t.charAt(i);  
            }
        }
        
        return Final;
        
    }
}