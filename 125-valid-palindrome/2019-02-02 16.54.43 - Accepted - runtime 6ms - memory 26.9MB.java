class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            char h = s.charAt(i);
            while(!Character.isLetterOrDigit(h) && i<s.length()-1){
                h=s.charAt(++i);
            }
            char t = s.charAt(j);
             while(!Character.isLetterOrDigit(t) && j>0){
                t=s.charAt(--j);
            }
            if (Character.isLetterOrDigit(h) && Character.isLetterOrDigit(t) && h!=t) return false;
        }
        return true;
    }
}