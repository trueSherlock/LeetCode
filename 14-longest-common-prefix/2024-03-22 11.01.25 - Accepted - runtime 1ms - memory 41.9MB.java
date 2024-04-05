class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
            return strs[0];
        if(strs.length==0)
            return null;
        String prefix = findMatchingPre(strs[0],strs[1]);
        for(int i=2;i<strs.length && prefix.length()>0;i++){
            prefix = findMatchingPre(prefix, strs[i]);
        }
        return prefix;
    }

    public String findMatchingPre(String s1, String s2){
        StringBuilder prefix = new StringBuilder();
        for(int i=0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i)==s2.charAt(i)){
                prefix.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return prefix.toString();
    }
}