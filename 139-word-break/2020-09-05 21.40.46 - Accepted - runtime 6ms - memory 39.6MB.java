class Solution {
    public boolean wordBreakRec(String s, List<String> wordDict) {
        int size = s.length();
        if(size==0) return true;

        //check for all prefix lenghts
        for(int i =1;i<=size;i++){
            if(wordDict.contains(s.substring(0, i)) && 
                wordBreakRec(s.substring(i), wordDict)){
                    return true;
            }
        }
        return false;
    }


    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dictSet = new HashSet<>(wordDict);
        int size = s.length();
        
        //string(0,i) can be segmented to dict word
        boolean[] wordBreakableAtSubstr = new boolean[size+1];
        wordBreakableAtSubstr[0] = true;
        //check for all prefix lenghts
        for(int i =1;i<=size;i++){
            for(int j=0;j<i;j++){
                if( wordBreakableAtSubstr[j] && dictSet.contains(s.substring(j,i))){
                    wordBreakableAtSubstr[i] = true;
                    break;
                }
            }
        }
        return wordBreakableAtSubstr[size];
         
    }

}