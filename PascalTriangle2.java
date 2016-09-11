public class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> outerList = new LinkedList<>();
        
        for(int i=0;i<rowIndex+1;i++){
            
            List<Integer> innerList = new ArrayList<Integer>();
            if(i==0){
                innerList.add(1);    
            }else{
                List<Integer> intermediate =  outerList.get(i-1);    
                innerList.add(1);
                int j=1;
                while(j < intermediate.size()){
                    innerList.add(intermediate.get(j)+intermediate.get(j-1));
                    j=j+1;
                }
                innerList.add(1);
            }
            outerList.add(innerList);
        }
       
        return outerList.get(rowIndex);
    
    }
}