class Solution {
    public int findNumbers(int[] nums) {
        int evenCnt=0;
        for(int n:nums){
            if(nOfDig(n)%2==0)
                evenCnt++;
        }
        return evenCnt;
    }
    
    public int nOfDig(int num){
        int digCnt=0;
        for(;num>0;num=num/10,digCnt++);
        return digCnt;
    }
}