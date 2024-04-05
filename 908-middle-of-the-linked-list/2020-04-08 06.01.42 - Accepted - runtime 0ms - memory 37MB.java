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
        ListNode sPtr = head,fPtr=null;
        if(null==sPtr.next){
            return sPtr;
        }
        if(null==sPtr.next.next){
            return sPtr.next;
        }
        
        fPtr = sPtr.next.next;
        while(fPtr!=null){
            sPtr = sPtr.next;
            fPtr = fPtr.next;
            if(fPtr!=null){
                fPtr = fPtr.next;
                if(fPtr==null) sPtr=sPtr.next;
            }    
        }
        return sPtr;
    }
}