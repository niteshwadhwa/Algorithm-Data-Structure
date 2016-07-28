public class Solution {
    public int titleToNumber(String s) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
       
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       
        for(int i=0;i<alphabets.length();i++){
            hash.put(alphabets.charAt(i),i+1);
        }

        int row = 0;
        int value = 0;
        int power = 0;
        
        for(int i=0; i< s.length();i++){
            value = hash.get(s.charAt(i));
            power = (int) Math.pow(26,(s.length()-(i+1)));
            row = row + (value*power);
        }
        
        
        return row;

        
    }
}