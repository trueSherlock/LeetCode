class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> freqMap = Arrays.stream(words).
            collect(Collectors.groupingBy(key->key.toLowerCase(),Collectors.summingInt(e->1)));
       List<String> wordsOut = new ArrayList(freqMap.keySet());
        Collections.sort(wordsOut,(o1,o2)->freqMap.get(o1).equals(freqMap.get(o2))?
                         o1.compareTo(o2):freqMap.get(o2).compareTo(freqMap.get(o1)));
        
        return wordsOut.subList(0,k);
    }
}