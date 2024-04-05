class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int i=s.length()-1;
        
        for(i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                len++;
            }else{
                if(len>0) return len;
            }
        }
        return len;
    }
}