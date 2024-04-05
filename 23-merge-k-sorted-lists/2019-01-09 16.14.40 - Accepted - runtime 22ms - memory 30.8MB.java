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

            PriorityQueue<ListNode> heap = new PriorityQueue<>(11,new Comparator<ListNode>(){
                @Override
                public int compare(ListNode l1,ListNode l2){
                    /*if(l1.val<l2.val) return -1;
                    else if(l1.val>l2.val) return 1;
                    else return 0;*/
                    return l1.val - l2.val;
                    
                }
            });
            for(ListNode list : lists){
                if(list!=null)
                    heap.add(list);
                 
            }

           ListNode ptr = head;
           while(!heap.isEmpty()){
                ptr.next = heap.remove();
                ptr = ptr.next;
                if(ptr.next!=null){
                    heap.add(ptr.next);
                }
            }
        }
        return head.next;
    }
}