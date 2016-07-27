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
    public TreeNode invertTree(TreeNode root) {
    
         TreeNode tmp;
    
            if(root == null){
                return root;
            }else if(root.left == null && root.right==null){
                return root;
            }else{
                tmp = root.right;
                root.right = root.left;
                root.left = tmp;
            }

        
         if(root.left != null){
            tmp   = invertTree(root.left);
         }
         if(root.right != null){
            tmp = invertTree(root.right);
         }
        
        return root;
    }    
}