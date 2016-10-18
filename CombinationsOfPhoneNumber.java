public class Solution {
   
    
    public List<String> letterCombinations(String digits) {
        
       
        List<String> arr = new ArrayList<String>();
        
        if(digits.length() <= 0 || digits.equals("")) return arr;
        else arr.add("");    
        
        String[] letters = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};     
        
        for(int i=0;i<digits.length();i++){
            char[] values = (letters[Character.getNumericValue(digits.charAt(i))]).toCharArray();
           
            int count = arr.size();
            while(count-1 >= 0){
                String s = arr.remove(count-1);
                for(char ch: values){
                    arr.add(s+ch);
                }
                count--;
            }
    
        }
        
        return arr;
    }
    
    
}