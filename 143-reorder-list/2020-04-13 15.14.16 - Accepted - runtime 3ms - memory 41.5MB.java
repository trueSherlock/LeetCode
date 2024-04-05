/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 
 1->2->3->4
 4,3,2,1
 1->4->2 [3,2,1]
 1->4->2->3 [2,1]
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head!=null){
            Deque<ListNode> stack = new ArrayDeque<>();
            ListNode cur = head;
            while(cur!=null){
                stack.push(cur);
                cur=cur.next;
            }
            cur = head;

            ListNode tmp = null;
            while(cur!=stack.peek() && cur.next!=stack.peek()){
                tmp = cur.next;
                cur.next = stack.pop();
                cur = cur.next;
                cur.next = tmp;
                cur = cur.next;
            }
            while(cur!=stack.peek()) cur = cur.next;
            cur.next = null;
        }
    }
}