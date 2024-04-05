/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseListiter(ListNode head) {
        if(head==null) return head;
        Deque<ListNode> stack = new ArrayDeque<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        ListNode newHead = stack.pop();
        ListNode curPtr = newHead;
        while(!stack.isEmpty()){
            curPtr.next = stack.pop();
            curPtr = curPtr.next;
        }
        curPtr.next = null;
        return newHead;
    }
    
    public ListNode reverseList(ListNode head){
        if(head==null || head.next==null ) return head;
      
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}