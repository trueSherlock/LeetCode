public class Solution {
    public String reverseWords(String s) {
        String o = reverseAWord(s);
        String[] words = o.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String word:words){
            sb.append(reverseAWord(word)).append(" ");
        }
        if(sb.length()>0)
            sb.setLength(sb.length()-1);
        return sb.toString();
    }

    public String reverseAWord (String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}