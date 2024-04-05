class Solution {
    boolean[][] visited;
    public int numIslands(char[][] grid) {
        if (grid==null || grid.length==0 || grid[0].length==0) return 0;
        visited = new boolean[grid.length][grid[0].length];
        int cnt =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    doDfs(grid,i,j);
                    cnt++;
                }
            }
        }
        //System.out.println(Arrays.deepToString(visited));
        return cnt;
    }

    private boolean canVisit(char[][] grid,int row,int col){
        return (row<grid.length && row>=0 && col<grid[0].length && col>=0  
            && grid[row][col]=='1' && !visited[row][col]);
    }

    private void doDfs(char[][] grid,int r, int c){
        /*neighbors : (i-1,j-1),(i-1,j),(i-1,j+1),
                      (i+1,j-1),(i+1,j),(i+1,j+1),
                      (i,j-1),(i,j+1)*/
        int[] rowNbrs = {-1,1,0,0};
        int[] colNbrs = {0,0,-1,1};
        visited[r][c] = true;
        for(int i=0;i<4;i++){
            if(canVisit(grid,r+rowNbrs[i],c+colNbrs[i]))
                doDfs(grid,r+rowNbrs[i],c+colNbrs[i]);

        }
        
    }
}