/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode ptr1=dummy.next;
        ListNode ptr2=dummy.next;
        
        while(ptr2!=null){
            if(ptr1.val!=ptr2.val){
                ptr1.next = ptr2;
                ptr1 = ptr2;
                ptr2= ptr2.next;
            }else{
                ptr2 = ptr2.next;
            }    
        }
        if(ptr1!=ptr2){
            ptr1.next = null;
        }
        return dummy.next;
    }
}