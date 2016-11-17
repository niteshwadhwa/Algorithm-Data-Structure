public class Solution {
    
    public String getPermutation(int n, int k) {
        
		
		
		
        int[] factorial = new int[n+1];
        ArrayList<Integer> arr= new ArrayList<Integer>(); 
        StringBuffer str = new StringBuffer("");
        
        if(n > 0) factorial[0] = 1;
        if(n >= 1) factorial[1] = 1;
        for(int i=2;i<=n;i++){
            factorial[i] = factorial[i-1]*i;
        }
        
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        
        k--;
        
        for(int i = 1; i <= n; i++){
            
            
            int index = k/factorial[n-i];
            str.append(""+arr.get(index));
            arr.remove(index);
            k = k - index*factorial[n-i];
            
        }
        
        
       return str.toString();
        
        
        
        
    }
    
    
}