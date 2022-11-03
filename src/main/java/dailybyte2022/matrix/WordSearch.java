package dailybyte2022.matrix;

public class WordSearch {
    public static boolean solve(char [][] board, String word){
        boolean [][] seen = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(word.charAt(0) == board[i][j] && bfs(i, j, 0, word, board, seen))
                    return true;
            }
        }
        return false;
    }
    public static boolean bfs(int i, int j, int index, String word, char [][] board, boolean [][] seen){
        if(index == word.length())
            return true;
        if(seen[i][j] || word.charAt(index) != board[i][j] || index > word.length() || i < 0 ||
                j < 0 || i >= board.length || j >= board.length)
            return false;
        seen[i][j] = true;
        return bfs(i+1, j, index+1, word, board, seen) ||
                bfs(i-1, j, index+1, word, board, seen) ||
                bfs(i, j+1, index+1, word, board, seen) ||
                bfs(i, j-1, index+1, word, board, seen);

    }
}
