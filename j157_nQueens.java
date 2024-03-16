import java.util.ArrayList;
import java.util.List;

public class j157_nQueens {
    public static boolean isSafe(int row,int col, char[][]board){
        //horiz
        for(int j=0; j<board.length; j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }

        // vertical

        for(int i=0; i<board.length; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // upper left
        int i=row;
        for(int j=col; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        i=row;
        // upper right
        for(int j=col; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // lower left
        i=row;
        for(int j=col; j>=0 && i<board.length; i++, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // lower right
        i=row; 
        for(int j=col; i<board.length && j<board.length; i++, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        
        return true;


    }

    public static void saveBoard(char[][]board, List<List<String>> allBoards){
        String row="";
        List<String> newBoard = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            row="";
            for(int j=0; j<board.length; j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static void helper(char[][]board, List<List<String>> allBoards,int col ){
        if(col==board.length){
            saveBoard(board, allBoards);
            return;
        }

        for(int row=0; row<board.length; row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board, allBoards, col+1);
                board[row][col]='.';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][]board = new char[n][n];
        helper(board, allBoards,0);
        return allBoards;
 
    }

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<List<String>>();
        list = solveNQueens(4);
        System.out.println(list);
    }
}
