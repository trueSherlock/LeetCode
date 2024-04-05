class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = Math.max(sum, 0)+nums[i];
            max = Math.max(sum, max);
                
        }
        return max;
       
    }
}