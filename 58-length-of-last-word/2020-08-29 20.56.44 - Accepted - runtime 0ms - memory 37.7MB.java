class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int i=s.length()-1;
        boolean lastWordStarted = false;
        for(i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(lastWordStarted){
                    break;
                }else{
                    continue;
                }
            }else{
                if(!lastWordStarted){
                    lastWordStarted=true;
                }
                len++;
            }
        }
        return len;
    }
}