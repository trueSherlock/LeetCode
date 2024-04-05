/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * Height max value of leftheight+rightheight+1;
 */
class Solution {
    
    public int diameterOfBinaryTree(TreeNode root) {
        Sol s = new Sol();
        int height = height(root,s);
        //System.out.println(height);
        return s.ans>0?s.ans-1:0;
    }
    
    public int height(TreeNode root,Sol s){
        if(root==null) return 0;
        
        int leftHeight = height(root.left, s);
        int rightHeight = height(root.right,s);
        
        //update max height
        s.ans = Math.max(s.ans,leftHeight+rightHeight+1);
        //System.out.println("maxHeight :" + s.ans);
        return 1+Math.max(leftHeight,rightHeight);
    }
    
    private class Sol{
        int ans= 0;
    }
    
}