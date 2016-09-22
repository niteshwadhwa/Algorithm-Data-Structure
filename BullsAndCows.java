public class Solution {
    public String getHint(String secret, String guess) {
        
        int[] arr = new int[10];
        int cow = 0;
        int bull = 0;
        for(int i=0;i<secret.length();i++){
            
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));
            
            if( s == g){
                bull++;
            }else{
                
                if(arr[s] < 0){cow++;}
                if(arr[g] > 0){cow++;}
                arr[s] = arr[s] + 1;
                arr[g] = arr[g] - 1;
            }
            
        }
        return bull+"A"+cow+"B";
        
    }
}