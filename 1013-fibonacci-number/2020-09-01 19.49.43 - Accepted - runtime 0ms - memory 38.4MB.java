class Solution {
    public int fib(int N) {
        int[] fibArr = new int[N+2];
        fibArr[0] = 0;
        fibArr[1] = 1;
        for(int i=2;i<=N;i++){
            fibArr[i] = fibArr[i-1]+fibArr[i-2];
        }
        return fibArr[N];
    }
}