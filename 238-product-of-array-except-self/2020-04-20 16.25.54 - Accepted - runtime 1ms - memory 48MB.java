class Solution {
    //[1,2,3,4]
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        //leftProd [1,1,2,6]
        for(int i = 1;i<nums.length; i++){
            result[i] = result[i-1]*nums[i-1];
        }
        //rightProd [,6]   
        int rightRunningProd = 1;
        for(int i = nums.length-1;i>=0;i--){
            result[i] = result[i]*rightRunningProd;
            rightRunningProd = rightRunningProd*nums[i];
        }
       
        return result;
        
        
    }
}