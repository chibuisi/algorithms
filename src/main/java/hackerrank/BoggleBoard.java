package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BoggleBoard {
    public static List<String> solve(char[][] board, String[] words) {
        // Write your code here.
        List<String> result = new ArrayList<>();
        int rows = board.length, cols = board[0].length;
        for(String word : words){
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    if(board[i][j] == word.charAt(0) && search(word, board, i, j, 0))
                        result.add(word);
                }
            }
        }
        return result;
    }

    private static boolean search(String word, char[][] board, int i, int j, int index){
        if(index == word.length())
            return true;

        if(i < 0 || j < 0 || i >= board.length || j >= board.length || word.charAt(index) != board[i][j] || board[i][j] == ' ')
            return false;

        char temp = board[i][j];
        board[i][j] = ' ';
        if((i < board.length-1 && search(word, board, i+1, j, index+1)) || (i > 0 && search(word, board, i-1, j, index+1))
                || (i > 0 && j > 0 && search(word, board, i-1, j-1, index+1)) ||  (i < board.length-1 && j < board[0].length-1 && search(word, board, i+1, j+1, index+1))
                || (i > 0 && j < board[0].length-1 && search(word, board, i-1, j+1, index+1)) || (i < board.length-1 && j > 0 && search(word, board, i+1, j-1, index+1))
                || (j < board[0].length-1 && search(word, board, i, j+1, index+1)) || (j > 0 && search(word, board, i, j-1, index+1)))
            return true;
        board[i][j] = temp;
        return false;
    }

    public static void main(String[] args) {
        char [][] board = {
                {'t', 'h', 'i', 's', 'i', 's', 'a'},
                {'s', 'i', 'm', 'p', 'l', 'e', 'x'},
                {'b', 'x', 'x', 'x', 'x', 'e', 'b'},
                {'x', 'o', 'g', 'g', 'l', 'x', 'o'},
                {'x', 'x', 'x', 'D', 'T', 'r', 'a'},
                {'R', 'E', 'P', 'E', 'A', 'd', 'x'},
                {'x', 'x', 'x', 'x', 'x', 'x', 'x'},
                {'N', 'O', 'T', 'R', 'E', '-', 'P'},
                {'x', 'x', 'D', 'E', 'T', 'A', 'E'}
        };
        String [] word = {"PE", "le", "simple"};
        System.out.println(solve(board, word));
    }
}
