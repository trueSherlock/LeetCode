class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.setLength(0);
            s.chars().sorted().mapToObj(code->(char)code).forEach(sb::append);
            String sortedS = sb.toString();
            
            if(map.containsKey(sortedS)){
                map.get(sortedS).add(s);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sortedS,list);
            }
        }
        //System.out.println(map);
        return new ArrayList<List<String>>(map.values());
    }
    
    
}