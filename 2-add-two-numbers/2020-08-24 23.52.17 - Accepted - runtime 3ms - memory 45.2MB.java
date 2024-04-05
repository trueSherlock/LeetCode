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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode();
        ListNode resultPtr=resultHead;
        int carry=0,sum=0,l1Val,l2Val;
        if(l1==null) return l2;
        if(l2==null) return l1;
        while(l1!=null || l2!=null || carry>0){
            l1Val = (l1!=null)?l1.val:0;
            l2Val = (l2!=null)?l2.val:0;
            sum=(l1Val+l2Val+carry)%10;
            carry=(l1Val+l2Val+carry)/10;
            resultPtr.next = new ListNode(sum);
            resultPtr=resultPtr.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return resultHead.next;
    }
}