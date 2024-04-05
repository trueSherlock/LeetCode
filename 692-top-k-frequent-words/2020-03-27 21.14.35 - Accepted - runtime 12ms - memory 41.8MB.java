class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> freqMap = Arrays.stream(words).
            collect(Collectors.groupingBy(key->key.toLowerCase(),Collectors.summingInt(e->1)));
        
        PriorityQueue<String> pq = new PriorityQueue<>((o1,o2)->freqMap.get(o1).equals(freqMap.get(o2))?
                         o2.compareTo(o1):freqMap.get(o1).compareTo(freqMap.get(o2)));
       List<String> wordsOut = new ArrayList(k);
       /* Collections.sort(wordsOut,(o1,o2)->freqMap.get(o1).equals(freqMap.get(o2))?
                         o1.compareTo(o2):freqMap.get(o2).compareTo(freqMap.get(o1)));*/
        for(String s:freqMap.keySet()){
            pq.offer(s);
            if(pq.size()>k) pq.poll();
        }
        while(!pq.isEmpty())wordsOut.add(pq.poll());
        Collections.reverse(wordsOut);
        return wordsOut;
    }
}