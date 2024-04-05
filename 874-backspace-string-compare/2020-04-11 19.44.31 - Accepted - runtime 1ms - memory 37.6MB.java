class Solution {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder sb = new StringBuilder();
        for(char c : S.toCharArray()){
            if(c!='#'){
                sb.append(c);
            }else if(sb.length()>0){
                sb.setLength(sb.length()-1);
            }
        }
        String s=sb.toString();
        sb.setLength(0);
        for(char c : T.toCharArray()){
            if(c!='#'){
                sb.append(c);
            }else if(sb.length()>0){
                sb.setLength(sb.length()-1);
            }
        }
        return s.equals(sb.toString());
    }
    
}