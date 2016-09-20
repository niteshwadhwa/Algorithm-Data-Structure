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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> list = new LinkedList<String>();
        if(root == null){
            return list;
        }else if(root.left == null && root.right == null){
            list.add(String.valueOf(root.val));
            return list;
        }else{
            return checkPath(root,String.valueOf(root.val),list);
        }
    }
    
    public List<String> checkPath(TreeNode root, String s, List<String> list){
        if(root.left != null){
            list = checkPath( root.left,  s+"->"+String.valueOf(root.left.val),  list);
        }
        if(root.right != null){
            list = checkPath( root.right,  s + "->" + String.valueOf(root.right.val),  list);
        }
        if(root.left == null && root.right == null){
            list.add(s);
            return list;
        }else{
            return list;
        }
    }
}