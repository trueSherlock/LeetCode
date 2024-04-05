class Solution {
    public int balancedStringSplit(String s) {
        int rCtr=0, lCtr=0;
        int wordCtr = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                rCtr++;
            }else{
                lCtr++;
            }
            if(lCtr==rCtr){//split here
                wordCtr++;
                rCtr=0;
                lCtr=0;
            }
        }
        return wordCtr;
    }
}