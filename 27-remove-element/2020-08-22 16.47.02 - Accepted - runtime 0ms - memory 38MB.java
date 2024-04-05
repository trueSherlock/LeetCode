class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]==val){
                for(int j =i+1;j<length;j++){
                    nums[j-1]=nums[j];
                }
                length--;
                i--;
            }
            //System.out.println(Arrays.toString(nums));
        }
        return length;
    }
}