class Solution {
    public int[] findErrorNums(int[] nums) {
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
}