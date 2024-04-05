class Solution {
    public String restoreString(String s, int[] indices) {
        char[] outStr = new char[s.length()];
        for(int i=0;i<indices.length;i++){
            outStr[indices[i]] = s.charAt(i);
        }
        return new String(outStr);
    }
}