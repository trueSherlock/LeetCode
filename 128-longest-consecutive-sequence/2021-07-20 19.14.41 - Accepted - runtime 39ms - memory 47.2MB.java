class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        TreeSet<Integer> theSet = Arrays.stream(nums).boxed().collect(Collectors.toCollection(TreeSet::new));
        int maxLen = 1;int curLen=1;
        int prevN = theSet.first();
        for(int n : theSet){
            if(n==prevN) continue;
            if(n==prevN+1){
                curLen++;
                maxLen = Math.max(maxLen,curLen);
            }else{
                curLen=1;
            }
            prevN=n;
        }
        return maxLen;
    }
}