public class Solution {
    public boolean isValid(String s) {
        
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            String check = String.valueOf(s.charAt(i));
            if(check.equals("(") || check.equals("{") || check.equals("[")){
                arr.add(check);
            }else{
                if(arr.size()>0){
                    String retrieve = arr.get(arr.size()-1);
                    if((retrieve.equals("(") && check.equals(")")) || (retrieve.equals("{") && check.equals("}")) || (retrieve.equals("[") && check.equals("]"))){
                        arr.remove(arr.size()-1);
                    }else{
                        return false;
                    }    
                }else{
                    return false;
                }
            }
        }
        if(arr.size() == 0){
            return true;    
        }else{
            return false;
        }
        
    }
}