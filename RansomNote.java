public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        
        for(int i=0;i<magazine.length();i++){
            if(hash.containsKey(magazine.charAt(i))){
                int count = hash.get(magazine.charAt(i));
                count = count + 1;
                hash.put(magazine.charAt(i), count);
            }else{
                hash.put(magazine.charAt(i), 1);
            }
        }
        
        for(int i=0;i<ransomNote.length();i++){
            if(hash.containsKey(ransomNote.charAt(i))){
                int count = hash.get(ransomNote.charAt(i));
                if(count > 1){
                    count = count-1;
                    hash.put(ransomNote.charAt(i), count);
                }else{
                    hash.remove(ransomNote.charAt(i));
                }
            }else{
                return false;
            }
        }
        return true;
    }
}