class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        for(int fp=0,bp=A.length-1;fp<bp;fp++){
            if(A[fp]%2==1){//odd then swap
                int tmp=A[fp];
                A[fp--]=A[bp]; //fp-- to check again
                A[bp--]=tmp;
            }
               
        }
        return A;
    }
}