/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int count = 0;
    public int pathSum(TreeNode root, int sum) {
        
       HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
       hash.put(0,1);
       getPathSum(root, hash, 0, sum);     
       return count; 
        
    }
    
    public void getPathSum( TreeNode root, HashMap<Integer, Integer> hash, int sum, int target){
       
       if(root == null){
           return;
       }
       
       sum=sum + root.val;
       
       if(hash.containsKey(sum-target)){
           count = count+hash.get(sum-target);
       }
       
       if(hash.containsKey(sum)){
            int x = hash.get(sum);
            x = x+1;
            hash.put(sum, x);
       }else{
            hash.put(sum , 1);
       }
       
       getPathSum(root.left, hash, sum, target);
       getPathSum(root.right, hash, sum, target);
       hash.put(sum, hash.get(sum) - 1);
       
    }

}