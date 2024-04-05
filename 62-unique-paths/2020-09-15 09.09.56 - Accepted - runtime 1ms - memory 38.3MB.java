/*
* totalways to reach = total from top + total from left
* [1 1 1 1
*  1
*  1       ]
*/

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        Arrays.fill(grid[0],1);
        
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0) {
                    grid[i][j] = 1;
                }else{
                    grid[i][j] = grid[i-1][j]+grid[i][j-1];
                }
            }
        }
        return grid[m-1][n-1];
    }
}