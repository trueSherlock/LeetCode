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
    public boolean isPalindrome(ListNode head) {
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        ListNode prvSlow = null;
        ListNode tmp=null;

        printList(head);
        while(null!=fastPtr && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            //reverse
            tmp=slowPtr.next;
            slowPtr.next=prvSlow;
            prvSlow=slowPtr;
            slowPtr=tmp;
        }
        if(fastPtr!=null){
            slowPtr=slowPtr.next; //odd count case
        }
        
        printList(slowPtr);
        printList(prvSlow);

        while(null!=slowPtr){
            if(slowPtr.val!=prvSlow.val) return false;
            slowPtr=slowPtr.next;
            prvSlow=prvSlow.next;
        }
        return true;
    }
    
    public void printList(ListNode head){
        System.out.println();
        while(head!=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
    }
    
}