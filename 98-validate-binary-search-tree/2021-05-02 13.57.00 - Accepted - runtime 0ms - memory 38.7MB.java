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
    public boolean isValidBST(TreeNode root) {
        return validate(root,null,null);
    }
    private boolean validate(TreeNode root, Integer high, Integer low){
        if(root==null) return true;
        if((high!=null && root.val>=high )|| (low!=null && root.val<=low)) return false;
        return validate(root.left,root.val,low) && validate(root.right,high,root.val);
    }
}