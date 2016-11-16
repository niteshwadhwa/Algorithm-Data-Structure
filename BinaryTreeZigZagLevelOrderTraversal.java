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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> zigzag = new ArrayList<List<Integer>>();
        if(root == null){
            return zigzag;
        }
        List<TreeNode> tree = new ArrayList<TreeNode>();
        tree.add(root);
        getZigZagConversion(tree, zigzag, 0);
        return zigzag;
    }
    
    public void getZigZagConversion(List<TreeNode> tree, List<List<Integer>> zigzag, int even ){
     
        List<Integer> t1 = new ArrayList<Integer>();
        if(even%2 == 1){
           even = 1;
        }
        
        int j = tree.size()-1;
        
        while(j >= 0){
            
           TreeNode t = tree.remove(j);
           if(t != null){
               t1.add(t.val);
               if(even == 1){
                   tree.add(t.right);
                   tree.add(t.left);
               }else{
                   tree.add(t.left);
                   tree.add(t.right);
               }
           }
           j--;
           
        }
        
        if(t1.size() > 0){
           zigzag.add(t1);
           getZigZagConversion(tree, zigzag, even+1);
       }
       return; 
     
        
    }
    
    
}