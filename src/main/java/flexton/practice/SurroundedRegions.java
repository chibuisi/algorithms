package flexton.practice;

public class SurroundedRegions {
    public static void main(String[] args) {
        char [][] board = {
                {'X','X','X','X'},
                {'X','0','0','X'},
                {'X','X','0','X'},
                {'X','0','X','X'}
        };
        solve(board);
        for(char [] arr : board){
            for(char c : arr)
                System.out.print(c);
            System.out.println();
        }
    }
    public static void solve(char [][] board){
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++){
            if(board[i][0] == '0')
                bfs(board,i,0);
            if(board[i][cols-1] == '0')
                bfs(board,i,cols-1);
        }

        for(int i = 0; i < cols; i++){
            if(board[0][i] == '0')
                bfs(board, 0,i);
            if(board[rows-1][i] == '0')
                bfs(board,rows-1,i);
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == '0')
                    board[i][j] = 'X';
                else if(board[i][j] == '*')
                    board[i][j] = '0';
            }
        }
    }

    public static boolean isSafe(char [][] board, int i, int j){
        return i < board.length && i >= 0 && j < board[0].length && j >= 0 && board[i][j] == '0';
    }

    public static void bfs(char [][]board, int i, int j){
        if(isSafe(board, i, j))
            board[i][j] = '*';
        if(isSafe(board, i+1, j))
            bfs(board,i+1,j);
        if(isSafe(board,i-1,j))
            bfs(board,i-1,j);
        if(isSafe(board,i,j+1))
            bfs(board,i, j+1);
        if(isSafe(board, i, j-1))
            bfs(board, i, j-1);
    }
}
