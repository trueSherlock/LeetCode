class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> freqMap = Arrays.stream(arr)
                        .mapToObj(x->x)
                            .collect(
                                Collectors.groupingBy(
                                    Function.identity(),
                                    Collectors.summingInt(e->1)));
        //System.out.println(freqMap);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(freqMap::get)); //min heap
        pq.addAll(freqMap.keySet());
        //do k removals
        for(int i=k;i>0;i--){
            int polled = pq.poll();
            //System.out.println(polled);
            if(freqMap.computeIfPresent(polled,(key,v)->--v)>0){//return new value
                pq.offer(polled);
            }
             //System.out.println(freqMap);
        }
        return pq.size();
    }
}