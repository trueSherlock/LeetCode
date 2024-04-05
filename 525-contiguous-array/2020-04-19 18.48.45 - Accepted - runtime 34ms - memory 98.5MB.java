class Solution {
    public int findMaxLength(int[] nums) {
        int maxLen=0;
        int count = 0;
        Map<Integer,Integer> countIdxMap = new HashMap<>();
        countIdxMap.put(0,-1);
        for(int i=0;i<nums.length;i++){
            count=count+(nums[i]==0?-1:1);
            if(countIdxMap.containsKey(count)){
                maxLen = Math.max(maxLen,i-countIdxMap.get(count));
            }else{
                countIdxMap.put(count,i);
            }
        }
        return maxLen;
    }
}