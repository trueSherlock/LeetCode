/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node newHead = new Node(111);
        Node cur = head;
        Node newCur = newHead;
        Map<Node,Node> oldNewMap = new HashMap<>();
        while(cur!=null){
            Node newNode = new Node(cur.val);
            oldNewMap.put(cur,newNode);
            newCur.next = newNode;
            newCur = newCur.next;
            cur = cur.next;
        }
        oldNewMap.forEach((oldNd,newNd)->{
             if(null!=oldNd.random){
                newNd.random = oldNewMap.get(oldNd.random);
             }
            });
        return newHead.next;
    }
}