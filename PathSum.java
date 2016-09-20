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
         }if(root.left == null && root.right == null && root.val == sum){
             return true;
         }else{
             return calculateSum(root, root.val, sum);
         }
         
    }
    
    public boolean calculateSum(TreeNode root, int count, int sum){
      
       if(root.left != null){
           boolean value = calculateSum(root.left,count+root.left.val, sum);
           if(value == true){
               return true;
           }
       }
       
       if(root.right != null){
           boolean value = calculateSum(root.right,count+root.right.val, sum);
           if(value == true){
              return true;
           }
       }
       
       if(root.left == null && root.right == null && count == sum){
           return true;
       }else{
           return false;
       }
        
    }
    
    
}