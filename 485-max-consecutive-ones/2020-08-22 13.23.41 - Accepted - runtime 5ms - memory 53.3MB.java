class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCnt=0,curCnt=0;
        for(int n:nums){
            if(n==1){
                curCnt++;
                maxCnt=Math.max(maxCnt,curCnt);
            }else{
                curCnt=0;
            }
        }
        return maxCnt;
    }
}