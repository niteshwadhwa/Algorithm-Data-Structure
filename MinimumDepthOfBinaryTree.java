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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else if(root.left == null && root.right == null){
           return 1;
        }else{
            return findDepth(root,1);
        }    
    }
    
    
    public int findDepth(TreeNode root, int count){
        
        if(root.left == null && root.right == null){
            return count;
        }else{
           
            int leftChild = 0;
            int rightChild = 0;
           
            if(root.left != null){
              leftChild = findDepth(root.left,count+1);
            }
            
            if(root.right != null){
              rightChild = findDepth(root.right,count+1);
            }
            
            if(leftChild != 0 && rightChild != 0 && leftChild <= rightChild ){
                return leftChild;
            }else if(leftChild != 0 && rightChild != 0 && leftChild > rightChild ){
                return rightChild;
            }else if(leftChild != 0 && rightChild == 0){
                return leftChild;
            }else{
                return rightChild;
            }
            
        }
        
    }
    
    
    
}