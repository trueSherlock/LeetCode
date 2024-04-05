/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode sPtr = head,fPtr=head;
        
        while(fPtr!=null && fPtr.next!=null){
            sPtr = sPtr.next;
            fPtr = fPtr.next.next;
        }
        return sPtr;
    }
}