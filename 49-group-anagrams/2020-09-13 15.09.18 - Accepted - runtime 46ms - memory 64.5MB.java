class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.setLength(0);
            s.chars().sorted().mapToObj(code->(char)code).forEach(sb::append);
            String sortedS = sb.toString();
            
            map.computeIfAbsent(sortedS,k->new ArrayList<String>()).add(s);
            
        }
        //System.out.println(map);
        return new ArrayList<List<String>>(map.values());
    }
    
    
}