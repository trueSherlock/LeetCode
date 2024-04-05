class Solution {
    public void moveZeroes(int[] nums) {
        int nzp=-1;
        for(int fp=0;fp<nums.length;fp++){
            if(nums[fp]!=0){
                nums[++nzp]=nums[fp];
            }
        }
        for(nzp=nzp+1;nzp<nums.length;nzp++){
            nums[nzp]=0;
        }
    }
}