class Solution {
    public boolean validMountainArray(int[] A) {
        
        int i=0;
        
        while(i+1<A.length && A[i]<A[i+1])
            i++;
        if(i==0 || i==A.length-1)
            return false;
        while(i+1<A.length && A[i]>A[i+1])
            i++;
        
        return i==A.length-1;
    }
}