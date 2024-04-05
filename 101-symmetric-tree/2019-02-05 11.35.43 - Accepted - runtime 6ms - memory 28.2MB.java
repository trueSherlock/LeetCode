/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return checkSym(root.left,root.right);
        
    }
    
    public boolean checkSym(TreeNode subTree1, TreeNode subTree2){
        if(subTree1==null && subTree2 ==null) return true;
        if(subTree1!=null && subTree2 !=null){
            return subTree1.val == subTree2.val && checkSym(subTree1.left,subTree2.right) && checkSym(subTree1.right,subTree2.left);
        }else{
            return false;
        }
    }
}