class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length,(a,b)->b.compareTo(a));
        Arrays.stream(nums).forEach(e->pq.offer(e));
        for(int i=0;i<k-1;i++){
            pq.remove();
        }
        return pq.peek();
    }
}