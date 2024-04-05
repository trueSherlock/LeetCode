class Solution {
    public int lengthOfLongestSubstring(String s) {
        //adbccba
        Map<Character,Integer> charLastSeen = new HashMap<>();
        int max = 0;
        int sIdx,eIdx;
        for(sIdx=0,eIdx=0;eIdx<s.length();eIdx++){
            char curChar = s.charAt(eIdx);
            if(charLastSeen.containsKey(curChar)){
                sIdx = Math.max(sIdx,charLastSeen.get(curChar)+1);
            }
            charLastSeen.put(curChar,eIdx);
            max = Math.max(max,eIdx-sIdx+1); 
        }
        return max;
    }
}