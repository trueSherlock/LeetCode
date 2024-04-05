class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int u = nums.length-1;
        //find min
        while(l<u){
            int mid = (l+u)/2;
            if(nums[mid]>nums[u]){
                l = mid+1;
            }else{
                u = mid;
            }
        }
        
        int rot = l;
        l=0;
        u = nums.length-1;
        
        while(l<=u){
            int mid = (l+u)/2;
            int realMid = (mid+rot)%nums.length;
            if(nums[realMid]==target) return realMid;
            if(nums[realMid]<target) 
                l=mid+1;
            else
                u=mid-1;
        }
        return -1;
    }
}