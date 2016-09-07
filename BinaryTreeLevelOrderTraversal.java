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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<Integer> inner = new LinkedList<Integer>();
        List<List<Integer>> outer = new LinkedList<>();
        List<TreeNode> intermediateList = new LinkedList<TreeNode>();
        if(root == null){
            return outer;
        }else{
            inner.add(root.val);
            outer.add(inner);
            intermediateList.add(root);
            return traverseLevelOrder(intermediateList, outer);
        }
    }
    public List<List<Integer>> traverseLevelOrder(List<TreeNode> intermediateList, List<List<Integer>> outer ){
        List<Integer> inner = new LinkedList<Integer>();
        List<TreeNode> recursiveList = new LinkedList<TreeNode>();
        TreeNode tree = null;
        Iterator<TreeNode> itr = intermediateList.iterator();
        while(itr.hasNext()){
             tree= itr.next();
             if(tree.left != null){
                 inner.add(tree.left.val);
                 recursiveList.add(tree.left);
             }
             if(tree.right != null){
                 inner.add(tree.right.val);
                 recursiveList.add(tree.right);
             }
        }
        if(recursiveList.size()>0){
            outer.add(inner);
            return traverseLevelOrder(recursiveList, outer);
        }else{
            return outer;
        }
    }
}