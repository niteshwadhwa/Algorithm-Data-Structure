public class Solution {
    public int romanToInt(String s) {
        
        int total = 0;
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        hash.put("I",1);
        hash.put("V",5);
        hash.put("X",10);
        hash.put("L",50);
        hash.put("C",100);
        hash.put("D",500);
        hash.put("M",1000);
        
        for(int i=s.length()-1;i>=0;i--){
            if(i==(s.length()-1)){
                total = total + hash.get(String.valueOf(s.charAt(i)));
            }else{
                if(hash.get(String.valueOf(s.charAt(i))) < hash.get(String.valueOf(s.charAt(i+1)))){
                    total = total - hash.get(String.valueOf(s.charAt(i)));
                }else{
                    total = total + hash.get(String.valueOf(s.charAt(i)));
                }
            }
            
        }
        
        return total;
        
    }
}