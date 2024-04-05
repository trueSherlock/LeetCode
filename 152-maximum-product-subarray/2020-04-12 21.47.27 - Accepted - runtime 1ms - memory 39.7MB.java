class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int prevMax= nums[0];
        int prevMin= nums[0];
        int curMax,curMin;
        for(int i = 1;i<nums.length;i++){
            
            curMax = Math.max(nums[i],Math.max(nums[i]*prevMin,nums[i]*prevMax));
            curMin = Math.min(nums[i],Math.min(nums[i]*prevMin,nums[i]*prevMax));
            ans = Math.max(ans,curMax);
            prevMin = curMin;
            prevMax = curMax;
        }
        return ans;
    }
}