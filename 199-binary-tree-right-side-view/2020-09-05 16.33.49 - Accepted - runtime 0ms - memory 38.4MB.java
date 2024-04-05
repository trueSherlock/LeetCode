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
    public List<Integer> rightSideView1(TreeNode root) {
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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> theView = new ArrayList<>();
        viewHelper(root, 1,theView);
        return theView;
    }

    public void viewHelper(TreeNode root, int level,List<Integer> result){
        if(null==root) return;
        if(result.size()<level) result.add(root.val);
        viewHelper(root.right,level+1,result);
        viewHelper(root.left,level+1,result);
    }

}