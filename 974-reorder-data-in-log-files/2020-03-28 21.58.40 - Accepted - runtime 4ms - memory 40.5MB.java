class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Set<String> ordered = new TreeSet<>((v1, v2)->{
            String v1Val = v1.substring(v1.indexOf(" ")+1);
            String v2Val = v2.substring(v2.indexOf(" ")+1);
            String v1Id = v1.substring(0,v1.indexOf(" "));
            String v2Id = v2.substring(0,v1.indexOf(" "));
            return v1Val.equals(v2Val) ? v1Id.compareTo(v2Id) : v1Val.compareTo(v2Val);
        });

        List<String> digLog = new ArrayList<>();

        for(String s:logs){
            if(Character.isDigit(s.charAt(s.indexOf(" ")+1))){
                digLog.add(s);
            }else{
                ordered.add(s);
            }
        }
        String[] result = new String[logs.length];
        int k=0;
        for (String s : ordered) {
            result[k++] = s;
        }
        for(String s:digLog){
            result[k++] = s;
        }
        return result;
    }
}