package nickwhite.backtracking;

public class WordSearch {
    public static boolean solve(char [][] board, String word){
        if(board == null || word == null || word.length() == 0)
            return false;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(word.charAt(0) == board[i][j] && search(i, j, 0, word, board))
                    return true;
            }
        }
        return false;
    }

    private static boolean search(int i, int j, int index, String word, char[][] board) {
        if(index == word.length())
            return true;
        if(i < 0 || j < 0 || i >= board.length || j >= board[i].length || word.charAt(index) != board[i][j])
            return false;
        //char temp = board[i][j];
        //board[i][j] = ' ';
        if(
                search(i+1, j, index+1, word, board) ||
                search(i-1, j, index+1, word, board) ||
                search(i, j+1, index+1, word, board) ||
                search(i, j-1, index+1, word, board)
        )
            return true;
        //board[i][j] = temp;
        return false;
    }

    public static void main(String[] args) {
        char [][] arr = {
                {'c', 'b', 'o'},
                {'a', 't', 'k'},
                {'o', 'l', 'o'}
        };
        System.out.println(solve(arr, "book"));
    }
}
