class Solution {
   public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Set<Integer>> theMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> idxList = theMap.getOrDefault(nums[i],new HashSet<>());
            if(!idxList.isEmpty()) {
                for (int diff = 1; diff <= k; diff++) {
                    if (idxList.contains(Math.abs(i - diff))) {
                        return true;
                    }
                }
            }
            idxList.add(i);
            theMap.put(nums[i],idxList);
        }
      
        return false;
    }
}