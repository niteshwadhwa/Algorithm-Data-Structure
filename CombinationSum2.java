public class Solution {
    
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> row = new ArrayList<Integer>();
        Arrays.sort(candidates);
        getCombinations(row, candidates, target, 0, 0);
        return list;
    }
    
    public void getCombinations(List<Integer> row, int[] candidates, int target, int start, int sum){
        
        if(sum > target){
            return;
        }else if(sum == target){
            list.add(new ArrayList<Integer>(row));
            return;
        }
        
        for(int i=start;i<candidates.length;i++){
            if(i > start && candidates[i] == candidates[i-1]){
                ;
            }else{
                row.add(candidates[i]);
                getCombinations(row, candidates, target, i+1, sum+candidates[i]);  
                row.remove(row.size()-1);
            }
        }
        
    }
    
    
}