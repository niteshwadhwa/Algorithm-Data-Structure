public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue(k, Collections.reverseOrder());
        
        for(int i=0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[i].length;j++){
                
                if(k>pq.size()){
                     pq.add(matrix[i][j]);
                }else{
                    int maximum = pq.peek();
                    if(maximum > matrix[i][j]){
                        pq.poll();
                        pq.add(matrix[i][j]);
                    }
                }
               
            }
            
        }
        
        return pq.poll();
    }
}