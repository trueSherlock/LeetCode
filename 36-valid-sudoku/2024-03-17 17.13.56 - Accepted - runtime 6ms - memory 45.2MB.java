class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                if (!(checkRow(board,i) && checkCol(board,j))){
                    return false;
                }
            }
        }
        return checkBoxes(board);
    }

    private boolean checkRow(char[][] board, int r){
        Set<Character> checker = new HashSet<>();
        for(int c=0;c<9;c++){
            if(board[r][c]=='.') continue;
            if(!checker.add(board[r][c])) return false;
        }
        return true;
    }
    private boolean checkCol(char[][] board, int c){
        Set<Character> checker = new HashSet<>();
        for(int r=0;r<9;r++){
            if(board[r][c]=='.') continue;
            if(!checker.add(board[r][c])) return false;
        }
        return true;
    }
    
    private boolean checkBoxes(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Set<Character> checker = new HashSet<>();
                int re = (i+1)*3;
                int ce = (j+1)*3;
                //System.out.println("Row : "+r + "to " +(3+i));
                for(int r=re-3;r<re;r++){
                    for(int c=ce-3;c<ce;c++){
                        if(board[r][c]=='.') continue;
                        if(!checker.add(board[r][c])) return false;
                    }
                }
            }
        }
        return true;
    }
}