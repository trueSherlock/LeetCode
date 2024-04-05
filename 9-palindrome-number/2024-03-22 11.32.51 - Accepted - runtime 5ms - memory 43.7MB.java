class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x<10){
            return true;
        }
        String intStr = String.valueOf(x);
        for(int lptr=0, rptr=intStr.length()-1;lptr<rptr;lptr++,rptr--){
            if(intStr.charAt(lptr)!=intStr.charAt(rptr)){
                return false;
            }
        }
        return true;
    }
}