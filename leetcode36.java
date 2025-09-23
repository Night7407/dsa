
public class leetcode36 {
    public static boolean  rowcheck(char[][] board ,int i ,int j){
        char val = board[i][j];
        for(int row = 0;row<9;row++){
            if(row != i&& val == board[row][j]) return false;
        }
        return true;
    }
    public static boolean  colcheck(char[][] board ,int i ,int j){
        char val = board[i][j];
        for(int col = 0;col<9;col++){
            if(col != j&& val == board[i][col]) return false;
        }
        return true;
    }
     public static boolean  matrixcheck(char[][] board ,int i ,int j){
        char val = board[i][j];
        int startRow = (i/3)*3;
        int endRow = startRow + 2;
        int startCol = (j/3)*3;
        int endCol = startCol + 2;
        for(int r=startRow; r<=endRow; r++){
            for(int c=startCol; c<=endCol; c++){
                if(r!=i && c!=j && val == board[r][c]){
                    return false;
                }
            }
        }
        return true;
    }
    public static  boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<9;i++){
            for(int j  =0;j<9;j++){
                if(board[i][j] !='.'){
                    if(!rowcheck(board, i, j) || !colcheck(board, i, j)|| !matrixcheck(board, i, j)) return false;

                }
            }
        }
        return true;
    }
    public static void main(String[]args){
        
    }
}
