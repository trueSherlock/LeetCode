class Solution {
    public int[] findErrorNums1(int[] nums) {
        boolean[] numTrack = new boolean[nums.length+1];
        int[] result = new int[2];
        int i=0;
        for(;i<nums.length;i++){
            if(!numTrack[nums[i]]){
                numTrack[nums[i]]=true;
            }else{
                result[0]=nums[i];
            }
        }
       
        for(i=1;i<=nums.length;i++){
            if(!numTrack[i]){
                result[1]=i;
                break;
            }
        }
        return result;
    }

    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        for(int n:nums){
            if(nums[Math.abs(n)-1]<0){
                result[0]=Math.abs(n);
            }else{
                nums[Math.abs(n)-1] *=-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[1]=i+1;
                break;
            }
        }
        return result;
    }

}