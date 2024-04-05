class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = Arrays.stream(banned).collect(Collectors.toSet());
       // System.out.println(Arrays.asList(paragraph.split("[ ,.!?',;.]+")
        Map<String,Integer> freqMap = Arrays.stream(paragraph.split("[ ,.!?',;.]+")).filter(x->!bannedSet.contains(x))
            .collect(Collectors.groupingBy(x->x.toLowerCase(),Collectors.summingInt(e->1)));
        System.out.println(freqMap);
        
        PriorityQueue<String> pq = new PriorityQueue<>((v1,v2)->freqMap.get(v2).compareTo(freqMap.get(v1)));
        for(String s:freqMap.keySet()){
            pq.offer(s);
        }
        return pq.poll();
    }
}