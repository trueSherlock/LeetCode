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
class BSTIterator {

    Deque<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new ArrayDeque<>();
        if(null!=root){
            leftInorder(root);
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode topNode = stack.pop();
        int val = topNode.val;
        if(null!=topNode.right){
           leftInorder(topNode.right);
        }
        return val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
       return !stack.isEmpty();
    }

    private void leftInorder(TreeNode node){
        while(null!=node){
            stack.push(node);
            node=node.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */