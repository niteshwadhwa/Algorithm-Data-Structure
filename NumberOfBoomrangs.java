public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        double distance = 0;
        int count = 0;
        
        for(int i=0;i<points.length;i++){
            HashMap<Double, Integer> hash = new HashMap<Double, Integer>();
            for(int j=0;j<points.length;j++){
                if( i != j){
                    distance = Math.sqrt(Math.pow((points[j][0] - points[i][0]), 2) + Math.pow((points[j][1] - points[i][1]), 2));
                    if(hash.containsKey(distance)){
                        count = count + 2*hash.get(distance);
                        hash.put(distance, hash.get(distance)+1);
                    }else{
                        hash.put(distance, 1);
                    }
                }
            }
        }
        
        return count;
        
    }
}