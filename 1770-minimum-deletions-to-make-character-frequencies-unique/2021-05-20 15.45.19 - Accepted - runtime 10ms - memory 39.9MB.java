class Solution {
    public int minDeletions(String s) {
        int res = 0;
        int[] count = new int[26];
        
        for(char c: s.toCharArray()){
            count[c-'a']++;
        }
        
        Set<Integer> usedFreqs = new HashSet<>();
        for(int i=0;i<26;i++){
            while(count[i]>0 && !usedFreqs.add(count[i])){
                count[i]--; //delete the char
                res++;
            }
        }
        
        return res;
    }
}