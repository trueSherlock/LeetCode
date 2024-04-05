class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int u = nums.length-1;
        while(l<u){
            int mid = l+(u-l)/2;
            if(nums[mid]>nums[u]){
                //min must be b/w mid+1 and u
                l = mid+1;
            }else{ //min must be b/w l and mid
                u = mid;
            }
        }
        return nums[l];
    }
}