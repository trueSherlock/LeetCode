class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = Arrays.stream(nums).boxed().collect(
            Collectors.groupingBy(Function.identity(),Collectors.summingInt(n->1)));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(freqMap::get).reversed());
        freqMap.keySet().forEach(n->pq.offer(n));
        int[] retArr = new int[k];
        for(int i=0;i<k;i++){
            retArr[i]=pq.poll();
        }
        return retArr;
    }
}