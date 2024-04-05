class Solution {
    public int removeDuplicates(int[] nums) {
       int sp=0;
       for(int fp=1;fp<nums.length;fp++){
           if(nums[sp]!=nums[fp]){
               sp++;
               nums[sp]=nums[fp];
           }
       }
       return sp+1;
    }
}