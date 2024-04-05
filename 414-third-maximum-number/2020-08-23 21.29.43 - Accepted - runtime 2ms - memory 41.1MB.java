class Solution {
    public int thirdMax(int[] nums) {
        Integer max=nums[0],max2=null,max3=null;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<max){
                if(null!=max2 && nums[i]<max2){
                    if(null==max3 || (null!=max3 && nums[i]>max3)){
                        max3=nums[i];
                    }
                }else if(null==max2 || nums[i]>max2){
                    max3=max2;
                    max2=nums[i];
                }
            }else if(nums[i]>max){
                max3=max2;
                max2=max;
                max=nums[i];   
            }
        }
        return null!=max3?max3:max;
    }
}