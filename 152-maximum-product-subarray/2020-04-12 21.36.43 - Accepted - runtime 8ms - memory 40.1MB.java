class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int max = nums[0];
        int min = nums[0];
        TreeSet<Integer> tmp;
        for(int i = 1;i<nums.length;i++){
            tmp = new TreeSet<>(Arrays.asList(nums[i],nums[i]*min,nums[i]*max));
            max = tmp.last();
            min = tmp.first();
            ans = Math.max(ans,max);
            tmp.clear();
        }
        return ans;
    }
}