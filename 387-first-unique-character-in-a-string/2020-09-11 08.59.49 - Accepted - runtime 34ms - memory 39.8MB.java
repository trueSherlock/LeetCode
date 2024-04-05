class Solution {
    public int firstUniqChar(String s) {
       Map<Character,Integer> freqMap = s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.summingInt(e->1)));
        int idx=-1;
        for(char c : s.toCharArray()){
            idx++;
            if(freqMap.get(c)==1) return idx ;
        }
        return -1;
    }
}