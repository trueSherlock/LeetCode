/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Codec {
    private static final String NO_NODE="X";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(sb,root);
        sb.setLength(sb.length()-1);
        //System.out.println(sb.toString());
        return sb.toString();
    }

    private void buildString(StringBuilder sb, TreeNode root){
        if(root == null){
            sb.append(NO_NODE).append(",");
        }else{
            sb.append(root.val).append(",");
            buildString(sb, root.left);
            buildString(sb, root.right);
        }

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new ArrayDeque<>();
        nodes.addAll(Arrays.asList(data.split(",")));
        return buildTree(nodes);
    }

    private TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.poll();
        if(NO_NODE.equals(val)) return null;

        TreeNode newNode = new TreeNode(Integer.parseInt(val));
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));