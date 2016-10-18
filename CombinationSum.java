public class Solution {
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> row = new ArrayList<Integer>();
        getCombinations(list, row, candidates, target, 0, 0);
        return list;
    }
    
        
   public void getCombinations(List<List<Integer>> list, List<Integer> row, int[] cadidates,int target, int start, int sum){
        
        if(sum == target){
            list.add(new ArrayList<Integer>(row));
            return;
        }else if(sum > target){
            return;
        }
        
        for(int i=start;i<cadidates.length;i++){
            row.add(cadidates[i]);
            getCombinations(list, row, cadidates, target, i, sum+cadidates[i]);
            row.remove(row.size()-1);
        }
        
    }
    
    
}