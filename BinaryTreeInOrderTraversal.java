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
    public List<Integer> inorderTraversal(TreeNode root) {
           
          List<Integer> arr = new ArrayList<Integer>(); 
          if(root == null){
              return arr;
          }
          return getInOrderTraversal(root,arr);

    }
    
    public List<Integer> getInOrderTraversal(TreeNode root,List<Integer> arr){
        
        if(root==null){
            return arr;
        }
        
        arr = getInOrderTraversal(root.left,arr); 
        arr.add(root.val);
        arr = getInOrderTraversal(root.right,arr); 
        
        return arr;
    }
    
    
}