public class Solution {
    public int uniquePaths(int m, int n) {
       
        int[] curr = new int[n];
        
        Arrays.fill(curr,1);
     
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                curr[j] = curr[j-1]+curr[j];   
            }
        }
        
        return curr[n-1];   
    }
}