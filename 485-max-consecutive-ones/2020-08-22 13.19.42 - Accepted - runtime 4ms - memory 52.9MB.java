class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCnt=0,curCnt=0;
        boolean prevOne = false;
        for(int n:nums){
            if(n==1){
                curCnt++;
                prevOne=true;
            }else{
                prevOne=false;
                maxCnt=Math.max(maxCnt,curCnt);
                curCnt=0;
            }
        }
        return Math.max(maxCnt,curCnt);
    }
}