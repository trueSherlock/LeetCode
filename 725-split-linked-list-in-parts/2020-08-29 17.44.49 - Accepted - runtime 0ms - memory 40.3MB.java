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
    public ListNode[] splitListToParts(ListNode root, int k) {
        int listSize = getListSize(root);
        int numEle = listSize/k;
        int carry = listSize%k;

        ListNode[] splitLists = new ListNode[k];
        ListNode curNode = root;
        int splitListsIdx = 0;

        for(int i =0;(i<k && curNode!=null);i++){
            splitLists[i] = curNode;
            int curCtr = 1;
            while(curCtr<numEle){
                curNode = curNode.next;
                curCtr++;
            }
            if(carry>0){
                if(numEle>0){
                    curNode = curNode.next;
                }
                carry--;
            }
            ListNode temp = curNode.next;
            curNode.next = null;
            curNode = temp;
        }
        
        return splitLists;
    }

    public int getListSize(ListNode start){
        int ctr=0;
        while(start!=null){
            ctr++;
            start = start.next;
        }
        return ctr;
    }
}