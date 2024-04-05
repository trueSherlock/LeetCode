/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fastP = dummy.next;
        ListNode slowP = dummy;
        while(n-->0){
            fastP = fastP.next;
        }
        while(fastP!=null){
            slowP = slowP.next;
            fastP = fastP.next;
        }
        slowP.next = slowP.next.next;   
        return dummy.next;
    }
}