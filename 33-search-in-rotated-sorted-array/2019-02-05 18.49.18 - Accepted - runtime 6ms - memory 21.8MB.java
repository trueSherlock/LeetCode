class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int u = nums.length-1;
        while(l<=u){
            int mid = l+(u-l)/2;
            
            int num;
             if ((nums[mid] < nums[0]) == (target < nums[0])) {
            num = nums[mid];
        } else {
            num = target < nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
            /*if((nums[mid]<nums[0] && target<nums[0]) || 
               (nums[mid]>nums[0] && target>nums[0]))
                num = nums[mid];
            else
                num = target<nums[0] ? Integer.MIN_VALUE : Integer.MAX_VALUE;*/
            if(target<num){
                u = mid-1;
            }else if(target>num){
                l = mid+1;
            }else
                return mid;
        }
        return -1;
    }
}