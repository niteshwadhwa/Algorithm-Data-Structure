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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        boolean equality = false;
        
        if(p == null && q== null){
            return true;
        }
        
        if((p== null && q!= null) || (p!=null && q==null) || (p.val != q.val) || (p.left != null && q.left ==null) || (p.left == null && q.left !=null) || (p.right != null && q.right ==null) || (p.right == null && q.right !=null)){
            return equality;
        }
        
        if(p.left != null && q.left != null){
            equality = isSameTree(p.left,  q.left);
            if(equality == false){
                return false;
            }
        }
        
        if(p.right != null && q.right != null){
            equality = isSameTree(p.right,  q.right);
            if(equality == false){
                return false;
            }
        }
        
        return true;
        
    }
}