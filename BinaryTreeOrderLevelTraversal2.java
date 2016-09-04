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
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
		List<Integer> inner = new LinkedList<Integer>();
		List<TreeNode> tree = new LinkedList<TreeNode>();
		List<List<Integer>> outer = new LinkedList<List<Integer>>();   
		
        if(root != null){
            inner.add(root.val);
            tree.add(root);
            outer = traverse(outer,tree);
            outer.add(inner);
        }        
        return outer;
    }
    
    public List<List<Integer>> traverse(List<List<Integer>> outer, List<TreeNode> tree){
        
    	List<TreeNode> recursiveTree = new LinkedList<TreeNode>();
    	List<Integer> inner = new LinkedList<Integer>();
    	
    	Iterator<TreeNode> itr = tree.iterator();
    	while(itr.hasNext()){
    	    TreeNode t = itr.next();
    		if(t.left != null){
    			inner.add(t.left.val);
    			recursiveTree.add(t.left);
    		}
    		if(t.right != null){
    			inner.add(t.right.val);
    			recursiveTree.add(t.right);
    		}
    	}
    	if(inner.size() > 0){
    		outer = traverse(outer,recursiveTree);
    		outer.add(inner);
    	}
    	
    	return outer;
    	
        
    }
    

   
}