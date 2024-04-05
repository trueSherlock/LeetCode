class Solution {
    public int[] sortedSquares(int[] A) {
        int[] squares = new int[A.length];
        int left=0,right=A.length-1,i=A.length-1;
        while(left<=right){
            int sqLt=A[left]*A[left];
            int sqRt=A[right]*A[right];
            if(sqLt>sqRt){
                squares[i--]=sqLt;
                left++;
            }else{
                squares[i--]=sqRt;
                right--;
            }
        }
        return squares;
        
    }
}