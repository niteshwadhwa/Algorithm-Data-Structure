public class Solution {
    public boolean isHappy(int n) {
      
      int save = 0; 
      int remain = 0;
      HashSet<Integer> hash = new HashSet<Integer>();
      hash.add(n);
      
      while(n != 1){
          save = 0;
          while(n > 0){
              remain = n%10;
              save = save + remain*remain;
              n = n/10;
          }
          
          if(hash.contains(save)){
              return false;
          }else{
              hash.add(save);
          }
          
          n = save;
      }
          
      return true;      
             
    }
    
}