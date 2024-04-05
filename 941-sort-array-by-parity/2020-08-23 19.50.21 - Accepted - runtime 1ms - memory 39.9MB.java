class Solution {
    public int[] sortArrayByParity(int[] A) {
        int fp=0,bp=A.length-1;
        while(fp<bp){
            while(A[fp]%2==0 && fp<bp) fp++;
            while(A[bp]%2!=0 && fp<bp) bp--;
            if(fp<bp){
                int tmp=A[fp];
                A[fp++]=A[bp];
                A[bp--]=tmp;
            }
        }
        return A;
    }
}