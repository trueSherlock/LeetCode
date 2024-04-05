class Solution {
    public void moveZeroes(int[] nums) {
        int t;
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if((nums[i]==0)){
                    t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
                //System.out.println(Arrays.toString(nums));
            }
        }
    }
}