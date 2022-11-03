package dailybyte2022.matrix;

public class NumberOfIslands {
    public static int solve(char [][] board){
        int count = 0;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == '1'){
                    count++;
                    dfs(i, j, board);
                }
            }
        }
        return count;
    }
    public static void dfs(int i, int j, char [][] board){
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] == '0')
            return;
        board[i][j] = '0';
        dfs(i+1, j, board);
        dfs(i-1, j, board);
        dfs(i, j+1, board);
        dfs(i, j-1, board);
    }
}
