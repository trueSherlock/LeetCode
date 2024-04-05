class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> freqMap = Arrays.stream(words).
            collect(Collectors.groupingBy(key->key.toLowerCase(),Collectors.summingInt(e->1)));
         System.out.println(freqMap);
        SortedSet<Map.Entry<String,Integer>> freqEntrySet = new TreeSet<>((o1,o2)-> {
                int res =  o2.getValue().compareTo(o1.getValue());
                return res==0?
                        o1.getKey().compareTo(o2.getKey()):res;
            }
        );
        freqEntrySet.addAll(freqMap.entrySet());
        System.out.println(freqEntrySet);
        int ctr = 0;
        List<String> topWords = new ArrayList<>();
        for(Map.Entry<String,Integer> entry:freqEntrySet){
            if(ctr<k){
                topWords.add(entry.getKey());
                ctr++;
            }else{
                break;
            }
        }
        return topWords;
    }
}