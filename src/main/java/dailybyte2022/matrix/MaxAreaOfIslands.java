package dailybyte2022.matrix;

public class MaxAreaOfIslands {
    public static int solve(char [][] board){
        int max = 0;
        boolean [][] seen = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                max = Integer.max(max, area(i, j, board, seen));
            }
        }
        return max;
    }

    public static int area(int i, int j, char [][] board, boolean [][] seen){
        if(board[i][j] == '0' || seen[i][j] || i < 0 || j < 0 || i >= board.length || j >= board[i].length)
            return 0;
        seen[i][j] = true;
        return 1 + area(i+1, j, board, seen) + area(i-1, j, board, seen)
                + area(i, j+1, board, seen) + area(i, j-1, board, seen);
    }
}
