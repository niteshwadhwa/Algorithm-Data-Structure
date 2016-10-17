 // Using global Variables
 
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
    int number = 0;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
           count = k;
           getInorderTraversal(root);
           return number;
    }
    
    public void getInorderTraversal(TreeNode root){
        
        if(root.left != null){
            getInorderTraversal(root.left);
        }
        
        count = count-1;
        if( count == 0){
            number = root.val;
        }
        
        if(root.right != null){
            getInorderTraversal(root.right);
        }
        
    }
    
    
    
}
 
 
 
 
 
 
 
 
 // Using ArrayList
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
    public int kthSmallest(TreeNode root, int k) {
        
        List<Integer> arr = new ArrayList<Integer>();
        arr = getInorderTraversal(root,k, arr);
        return arr.get(k-1);
        
    }
    
    public List<Integer> getInorderTraversal(TreeNode root, int k, List<Integer> arr){
        
        if(root == null){
            return arr;
        }
        
        arr = getInorderTraversal(root.left,k,arr);        
        arr.add(root.val);
        arr = getInorderTraversal(root.right,k,arr);
        
        return arr;
    }
    
    
    
}