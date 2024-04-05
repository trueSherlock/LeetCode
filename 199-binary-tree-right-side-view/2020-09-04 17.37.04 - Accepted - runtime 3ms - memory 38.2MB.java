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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        Map<Integer,TreeNode> levelNodeMap = new TreeMap<>();
        Map<TreeNode,Integer> nodesLevelMap = new HashMap<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        if(root!=null){
            queue.add(root);
            int curLevel = 1;
            levelNodeMap.put(curLevel,root);
            nodesLevelMap.put(root,curLevel);
            TreeNode curNode = root;
            while(!queue.isEmpty()){
                curNode = queue.remove();
                curLevel = nodesLevelMap.get(curNode)+1;
                if(null!=curNode.left){
                    queue.add(curNode.left);
                    levelNodeMap.put(curLevel,curNode.left);
                    nodesLevelMap.put(curNode.left,curLevel);
                }
                if(null!=curNode.right){
                    queue.add(curNode.right);
                    levelNodeMap.put(curLevel,curNode.right);
                    nodesLevelMap.put(curNode.right,curLevel);
                }
            }
            levelNodeMap.forEach((x,y)->output.add(y.val));
        }
        return output;
    }
}