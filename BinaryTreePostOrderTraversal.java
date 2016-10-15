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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<Integer>();
        if(root == null){
            return arr;
        }
        return getPostOrderTraversal(root,arr);
    }
    
    public List<Integer> getPostOrderTraversal(TreeNode root, List<Integer> arr){
        if(root == null){
            return arr;
        }
        arr = getPostOrderTraversal(root.left, arr); 
        arr = getPostOrderTraversal(root.right, arr);
        arr.add(root.val);
        return arr;
    }
    
}