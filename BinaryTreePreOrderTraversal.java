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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<Integer>();
        if(root == null){
            return arr;
        }
        return getPreOrderTraversal(root,arr);
    }
    
    public List<Integer> getPreOrderTraversal(TreeNode root, List<Integer>arr){
        
        if(root == null){
            return arr;
        }
        
        arr.add(root.val);
        arr = getPreOrderTraversal(root.left,arr);
        arr = getPreOrderTraversal(root.right,arr);
        
        return arr;
    }
    
    
    
}