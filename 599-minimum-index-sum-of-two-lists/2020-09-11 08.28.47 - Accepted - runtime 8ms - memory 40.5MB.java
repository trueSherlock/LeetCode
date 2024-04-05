class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> l1ResIdxMap = new HashMap<>();
        List<String> ans = new ArrayList();
        int minSum = 3000;
        for(int i=0;i<list1.length;i++){
            l1ResIdxMap.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            if(l1ResIdxMap.containsKey(list2[i])){
                if(l1ResIdxMap.get(list2[i])+i<minSum){
                    minSum = l1ResIdxMap.get(list2[i])+i;
                    ans.clear();
                }
                if(l1ResIdxMap.get(list2[i])+i<=minSum){
                    ans.add(list2[i]);
                }
            }
        }
        return ans.toArray(new String[0]);
    }
}