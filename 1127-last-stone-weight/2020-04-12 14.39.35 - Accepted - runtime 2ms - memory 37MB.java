class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(stones.length,Collections.reverseOrder());
        
        Arrays.stream(stones).forEach(stone->pq.offer(stone));
        while(!pq.isEmpty()){
            if(pq.size()>1){
                int x = pq.poll();
                int y = pq.poll();
                if(x!=y){
                    pq.offer(x-y);
                }
            }else{
                return pq.poll();
            }
        }
        return 0;
    }
}