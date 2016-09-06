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
    public boolean isBalanced(TreeNode root) {
     
        if(root == null){
            return true;
        }else{
            if(balancedTree(root) == -1){
                return false;
            }else{
                return true;
            }
        }
        
     
    } 
    
    public int balancedTree(TreeNode root){
        
        int count1=0;
        int count2=0;
        
        if(root.left !=null){
            count1 += balancedTree(root.left);
            if(count1 == -1){
                return -1;
            }
            count1++;
            //System.out.println("node is= "+root.val+"count is= "+count1);
        }
        if(root.right != null){
            count2 += balancedTree(root.right);
            if(count2 == -1){
                return -1;
            }
            count2++;
            //System.out.println("node is= "+root.val+"count is= "+count2);
        }
        
        //System.out.println("count1= "+count1);
        //System.out.println("count2= "+count2);
        
        if((count1 > count2 && count1==count2+1) || count1 == count2){
            return count1;
        }else if(count1<count2 && count1+1==count2){
            return count2;
        }else{
            return -1;
        }
        
    
    }
    
    
    
}