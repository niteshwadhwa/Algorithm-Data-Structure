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
    public int maxDepth(TreeNode root) {
      
        if(root == null){
             return 0;
        }else{
            return findDepth(root, 1);
        }
     
    }
    
    public int findDepth(TreeNode root, int depth){
      
        if(root.left == null && root.right == null){
            return depth;
        }
        else 
        {
            int left = 0;
            int right = 0;
            if(root.left !=null){
                left=findDepth(root.left, depth+1);
            }
            if(root.right !=null){
                right=findDepth(root.right, depth+1);
            }
            
            if(left >= right){
                return left;
            }else{
                return right;
            }
            
        }
            
    }
    
}