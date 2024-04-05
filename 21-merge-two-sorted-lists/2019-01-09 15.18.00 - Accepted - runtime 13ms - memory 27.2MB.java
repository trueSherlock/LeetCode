/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l1Ptr = l1;
        ListNode l2Ptr = l2;
        
        ListNode head = null;
        if(l1==null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else if(l1.val<l2.val){
            head = l1;
            l1Ptr = l1Ptr.next;
        }else{
            head = l2;
            l2Ptr = l2Ptr.next;
        }
        
        ListNode fPtr = head;
        while(l1Ptr!=null && l2Ptr!=null){
            if(l1Ptr.val<l2Ptr.val){
                fPtr.next=l1Ptr;
                l1Ptr = l1Ptr.next;
            }else{
                fPtr.next=l2Ptr;
                l2Ptr = l2Ptr.next;
            }
            if(head==null){
                head = fPtr;
            }
            fPtr = fPtr.next;
        }
        if(l1Ptr==null){
            while(l2Ptr!=null){
                fPtr.next= l2Ptr;
                l2Ptr = l2Ptr.next;
                fPtr = fPtr.next;
            }
        }else{
            while(l1Ptr!=null){
                fPtr.next= l1Ptr;
                l1Ptr = l1Ptr.next;
                fPtr = fPtr.next;
            }
        }
        return head;
    }
}