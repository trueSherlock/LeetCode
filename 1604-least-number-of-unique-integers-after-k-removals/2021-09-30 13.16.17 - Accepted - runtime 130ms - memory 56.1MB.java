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
        while(k>0 && !pq.isEmpty()) k-=freqMap.get(pq.poll());
        return (k<0)?pq.size()+1:pq.size();
    }
}