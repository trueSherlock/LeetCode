/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        TreeSet<Integer> depths = new TreeSet<>();
        for(Node n : root.children){
            depths.add(maxDepth(n));
        }
        return depths.isEmpty()? 1:1+depths.last();
    }
}