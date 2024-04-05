/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return(checkHeight(root)!=Integer.MIN_VALUE);
    }
    
    public int checkHeight(TreeNode root){
        if(root==null) return 0;
        
        int leftHeight = checkHeight(root.left);
        if(leftHeight==Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        int rightHeight = checkHeight(root.right);
        if(rightHeight==Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        if(Math.abs(leftHeight-rightHeight)>1) return Integer.MIN_VALUE;
        
        return 1+Math.max(leftHeight,rightHeight);
    }
}