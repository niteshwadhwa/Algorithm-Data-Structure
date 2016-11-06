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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> arr = new ArrayList<Integer>();
        getPathSum(root, sum, arr, list);
        return list;
    }
    
    public void getPathSum(TreeNode root, int sum, List<Integer> arr, List<List<Integer>> list){
        
        if(root == null){
            return;
        }
        
        arr.add(root.val);
        getPathSum(root.left, sum-root.val, arr, list);
        getPathSum(root.right, sum-root.val, arr, list);
        
        if(root.left == null && root.right == null && sum-root.val == 0){
            list.add(new ArrayList<Integer>(arr));
        }
        
        arr.remove(arr.size()-1);
        return;
        
    } 
    
    
}