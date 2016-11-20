public class Solution {
    public int findMinArrowShots(int[][] points) {
        
        if(points.length == 0 ) return 0;
        if(points.length == 1) return 1;
             
        Arrays.sort(points, new Comparator<int[]>() {
	    	public int compare(int[] a, int[] b) {
		    	if(a[0]==b[0]) return a[1]-b[1];
			    else return a[0]-b[0];
		    }
    	});
	
        
        int count = 1;  
        int limit = points[0][1];
        for(int i=1;i<points.length;i++){
           
           if(limit < points[i][0]){
               count++;
               limit = points[i][1];
           }else{
              limit = Math.min(points[i][1], limit); 
           }
            
        }
        
        return count;
        
    }
}