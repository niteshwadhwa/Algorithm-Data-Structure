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
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root == null){
            return false;
        }
        
        if(hasPathSum(root.left, sum-root.val)) return true;
        if(hasPathSum(root.right, sum-root.val)) return true;
        
        if(root.left == null && root.right == null && sum - root.val == 0){
            return true;
        }else{
            return false;
        }
        
    }

    
}