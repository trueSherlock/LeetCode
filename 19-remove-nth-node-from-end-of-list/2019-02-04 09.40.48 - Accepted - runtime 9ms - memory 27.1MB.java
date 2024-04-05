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
        
        while(fastP!=null){
            if(n<=0){
                slowP = slowP.next;
            }
            fastP = fastP.next;
            n--;
        }
        slowP.next = slowP.next.next;   
        return dummy.next;
    }
}