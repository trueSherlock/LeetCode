class Solution {
    public boolean repeatedSubstringPattern(String s) {
       //return s.matches("^([a-z]+)\\1+");
       return (s+s).substring(1,2*s.length()-1).contains(s);
    }
}