class Solution {
    public String frequencySort(String s) {
        if(null==s) return s;
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> freqMap = 
            s.chars().mapToObj(c->(char)c)
                 .collect(Collectors.groupingBy(Function.identity(),Collectors.summingInt(e->1)));
        SortedSet<Map.Entry<Character,Integer>> sorted = 
            new TreeSet<>((e1,e2)->(e2.getValue()-e1.getValue())==0?e2.getKey().compareTo(e1.getKey()):e2.getValue().compareTo(e1.getValue()));
        //System.out.println(freqMap);
        sorted.addAll(freqMap.entrySet());

        sorted.forEach(e->sb.append(new String(new char[e.getValue()]).replace('\0',e.getKey())));
        return sb.toString();
    }
}