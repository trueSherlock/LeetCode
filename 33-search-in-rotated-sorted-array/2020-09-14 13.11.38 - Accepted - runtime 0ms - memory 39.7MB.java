class Solution {
    public int search(int[] nums, int target) {
        int lo=0, hi=nums.length-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(nums[mid]==target) return mid;
            
            if(nums[lo]<=nums[mid]){//sorted subarray
                //means target in this subarray
                if(target<nums[mid] && target>=nums[lo]){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }else{
            //if(nums[mid]<=nums[hi]){//sorted subarray
                if(target<=nums[hi] && target>nums[mid]){
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }
        }
        return -1;
    }
}