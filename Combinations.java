public class Solution {

   List<List<Integer>> list = new ArrayList<List<Integer>>();       
   public List<List<Integer>> combine(int n, int k) {
       List<Integer> row = new ArrayList<Integer>();
       getCombinations(list, row, 1, n , k);
       return list;
   }
   
   public void getCombinations(List<List<Integer>> list, List<Integer> row, int start, int n, int k){
       if(k == 0){
           list.add(new ArrayList(row));
           return;
       }
       
       for(int i=start;i<=n;i++){
           row.add(i);
           getCombinations(list, row, i+1, n , k-1);
           row.remove(row.size()-1);
       }
       
   }
   
   
  
}