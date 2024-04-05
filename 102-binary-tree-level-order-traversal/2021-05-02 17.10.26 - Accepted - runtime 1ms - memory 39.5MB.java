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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> curLevelNodes = new ArrayDeque<>();
        List<Integer> curLevelElts = new ArrayList<>();
        if(null!=root){
            curLevelNodes.add(root);
            curLevelElts.add(root.val);

            while(!curLevelNodes.isEmpty()){
                Deque<TreeNode> prevLevNodes = curLevelNodes;
                res.add(curLevelElts);

                curLevelNodes = new ArrayDeque<>();
                curLevelElts = new ArrayList<>();

                for(TreeNode n:prevLevNodes){
                    if(null!=n.left){
                        curLevelNodes.add(n.left);
                        curLevelElts.add(n.left.val);
                    }
                    if(null!=n.right){
                        curLevelNodes.add(n.right);
                        curLevelElts.add(n.right.val);
                    }
                }

            }
            
        }
        return res;
    }
}