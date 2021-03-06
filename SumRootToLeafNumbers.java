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
    
    public int sumNumbers(TreeNode root) {
        return getSum(root, 0);
    }
    
    public int getSum(TreeNode root, int sum){
        
        if(root == null){
            return 0;
        }
        
        sum = 10*sum+root.val;
        
        if(root.left == null && root.right == null){
            return sum;
        }
        
        return getSum(root.left,sum) + getSum(root.right,sum);
        
    }
    
    
}