public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        if(obstacleGrid[0][0] == 1){
            return 0;
        }
        
        int[] curr = new int[obstacleGrid[0].length];
        curr[0] = 1;
        
        for(int i=0;i<obstacleGrid.length;i++){
            for(int j=0;j<obstacleGrid[0].length;j++){
               if( j == 0 && obstacleGrid[i][j] == 1){
                   curr[0] = 0;
               }
               if(j > 0){
                   curr[j] = obstacleGrid[i][j] == 1?0:curr[j]+curr[j-1];    
               }
            }
        }
    
        return curr[curr.length-1];
        
    }
}