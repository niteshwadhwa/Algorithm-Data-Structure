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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null){
            return root;
        }else if(root.val > p.val && root.val > q.val){
            root = root.left;
            root = lowestCommonAncestor(root, p, q); 
            return root;
        }else if(root.val < p.val && root.val < q.val){
            root = root.right;
            root = lowestCommonAncestor(root, p, q); 
            return root;
        }else{
            return root;
        }
        
    }
    
}