package flexton;

import java.util.Arrays;

public class SurroundedRegions {
    public static void main(String[] args) {
        char [][] board = {
                {'X','X','X','X'},
                {'X','0','0','X'},
                {'X','X','0','X'},
                {'X','X','X','X'}
        };
        solve(board);
        for(char [] arr : board){
            for(char c : arr)
                System.out.print(c);
            System.out.println();
        }
    }
    public static boolean isSafe(char [][] board, int i, int j){
        return i >= 0 && i < board.length-1 && j >= 0 && j < board[0].length && board[i][j] == '0';
    }
    public static void solve(char [][] board){
        int rows = board.length-1;
        int columns = board[0].length-1;

        for(int i = 0; i < rows; i++){
            if(board[i][0] == '0')
                DFS(board, i, 0);
            if(board[i][columns] == '0')
                DFS(board, i, columns);
        }

        for(int i = 0; i < columns; i++){
            if(board[0][i] == '0')
                DFS(board, i, 0);
            if(board[rows][i] == '0')
                DFS(board, rows, i);
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(board[i][j] == '0')
                    board[i][j] = 'X';
                else if(board[i][j] == '*')
                    board[i][j] = '0';
            }
        }
    }
    public static void DFS(char [][] board, int i, int j){
        if(isSafe(board, i, j))
            board[i][j] = '*';
        if(isSafe(board, i+1, j))
            DFS(board, i+1, j);
        if(isSafe(board, i-1, j))
            DFS(board, i-1, j);
        if(isSafe(board, i, j+1))
            DFS(board, i, j+1);
        if(isSafe(board, i, j-1))
            DFS(board, i, j-1);
    }
}
