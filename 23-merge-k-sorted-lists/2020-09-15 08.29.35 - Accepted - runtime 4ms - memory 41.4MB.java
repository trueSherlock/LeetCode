/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        if(lists.length>0){
            LinkedList<ListNode> out = new LinkedList<>();

            PriorityQueue<ListNode> heap = new PriorityQueue<>((l1,l2)->l1.val-l2.val);
                    
            for(ListNode list : lists){
                if(list!=null)
                    heap.offer(list);
                 
            }

           ListNode ptr = head;
           while(!heap.isEmpty()){
                ptr.next = heap.poll();
                ptr = ptr.next;
                if(ptr.next!=null){
                    heap.offer(ptr.next);
                }
            }
        }
        return head.next;
    }
}