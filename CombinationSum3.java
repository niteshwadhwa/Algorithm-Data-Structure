public class Solution {
    
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> row = new ArrayList<Integer>();
        getCombinationSum(row, k, n, 1);
        return list;
    }
    
    public void getCombinationSum(List<Integer> row, int k, int n, int start){
        if(k == 0 ){
            if(n==0){
                list.add(new ArrayList<Integer>(row));    
            }
            return;
        }else if(n < 0){
            return;
        }
        
        for(int i=start;i<=9;i++){
            row.add(i);
            getCombinationSum(row, k-1, n-i, i+1);
            row.remove(row.size()-1);
        }
        
        
    }
    
}