/*Store if row has 0 in r
Store if col has 0 in c1*/
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean r1Has0=false, c1Has0=false;
        
        //Check first row for 0
        for(int c=0;c<matrix[0].length;c++){
            if(matrix[0][c]==0){
                r1Has0=true;
                break;
            }
        }
        
        //Check first col for 0
        for(int r=0;r<matrix.length;r++){
            if(matrix[r][0]==0){
                c1Has0=true;
                break;
            }
        }
        
        //check rest of matrix
        for(int r=1;r<matrix.length;r++){
            for(int c=1;c<matrix[0].length;c++){
                if(matrix[r][c]==0){
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }
        
        for(int r=1;r<matrix.length;r++){
            if(matrix[r][0]==0)
                nullifyRow(matrix,r);
        }
        
        for(int c=1;c<matrix[0].length;c++){
            if(matrix[0][c]==0)
                nullifyCol(matrix,c);
        }
        
        if(r1Has0) nullifyRow(matrix,0);
        if(c1Has0) nullifyCol(matrix,0);
        
    }
    
    private void nullifyRow(int[][] matrix, int r){
        for(int c=0;c<matrix[0].length;c++){
            matrix[r][c]=0;
        }
    }
    
       
    private void nullifyCol(int[][] matrix, int c){
        for(int r=0;r<matrix.length;r++){
            matrix[r][c]=0;
        }
    }
}