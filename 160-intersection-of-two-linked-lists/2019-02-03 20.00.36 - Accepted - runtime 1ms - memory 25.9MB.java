/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLen = getLength(headA);
        int bLen = getLength(headB);
        
        ListNode aPtr = headA;
        ListNode bPtr = headB;
        if(aLen>bLen){
            for(int i=0;i<(aLen-bLen);i++){
                aPtr = aPtr.next;
            }
        }else if(bLen>aLen){
            for(int i=0;i<(bLen-aLen);i++){
                bPtr = bPtr.next;
            }
        }
        while(aPtr!=null){
            if(aPtr==bPtr){
                return aPtr;
            }
            aPtr = aPtr.next;
            bPtr = bPtr.next;
        }
        return null;
    }
    private int getLength(ListNode head){
        int len = 0;
        while(head!=null){
            head=head.next;
            len++;
        }
        return len;
    }
}