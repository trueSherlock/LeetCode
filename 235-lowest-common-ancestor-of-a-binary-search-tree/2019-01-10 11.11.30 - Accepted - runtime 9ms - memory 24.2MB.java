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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        /*if(p.left==q || p.right==q){
            return p;
        }
        if(q.left==p || q.right==p){
            return q;
        }*/
        if(root.val>p.val && root.val>q.val){ //ancestor is  to the left
            return lowestCommonAncestor(root.left,p,q);
        }else if (root.val<p.val && root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return root;
        }
            
        
    }
}