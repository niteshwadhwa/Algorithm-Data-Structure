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
    public boolean isSymmetric(TreeNode root) {
		
		
        if(root == null || root.left == null && root.right == null){
            return true;
        }else if((root.left != null && root.right == null) || (root.right != null && root.left == null) || (root.left.val != root.right.val)){
            return false;
        }else{
            List<TreeNode> leftTree = new LinkedList<TreeNode>();
            List<TreeNode> rightTree = new LinkedList<TreeNode>();
            leftTree.add(root.left);
            rightTree.add(root.right);
            return traverse(leftTree,rightTree);
        }
    }
    
    public boolean traverse(List<TreeNode> leftTree,List<TreeNode> rightTree){
        
        List<TreeNode> recursiveLeftTree = new LinkedList<TreeNode>();
        List<TreeNode> recursiveRightTree = new LinkedList<TreeNode>();
        
        Iterator<TreeNode> itr = leftTree.iterator();
        Iterator<TreeNode> itr1 = rightTree.iterator();
        
        while(itr.hasNext() && itr1.hasNext()){
           TreeNode leftT = itr.next();
           TreeNode rightT = itr1.next();
           if(leftT.left == null && rightT.right == null){
               ;
           }else if(leftT.left != null && rightT.right != null && leftT.left.val == rightT.right.val){
               recursiveLeftTree.add(leftT.left);
               recursiveRightTree.add(rightT.right);
           }else{
               return false;
           }
           
           if(leftT.right == null && rightT.left == null){
           }else if(leftT.right != null && rightT.left != null && leftT.right.val == rightT.left.val){
               recursiveLeftTree.add(leftT.right);
               recursiveRightTree.add(rightT.left);
           }else{
               return false;
           }
           
        }
        
        if(recursiveLeftTree.size() > 0 && recursiveRightTree.size() > 0){
        	return traverse(recursiveLeftTree,recursiveRightTree);
        }else{
        	return true;
        }
        
    }
    
}