package altemetriks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BoggleBoard {
    public static void main(String[] args) {
//        [
//                ["A","B","C","E"],
//                ["S","F","C","S"],
//                ["A","D","E","E"]],false
        char [][] board ={
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };//true
        String word = "ABCCEDFA";
        BoggleBoard ob = new BoggleBoard();
        System.out.println(ob.searchWord(board,word));
    }
    public boolean searchWord(char [][] board, String word){
        int rows = board.length;
        int cols = board[0].length;
        boolean [][] visited = new boolean[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < rows; j++){
                if(word.charAt(0) == board[i][j] && searchWord(board, i, j, word, 0, visited))
                    return true;
            }
        }
        return false;
    }

    public boolean searchWord(char[][]board, int i, int j, String word, int index, boolean [][] visited){
        if(word.length() == index)
            return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || visited[i][j] || word.charAt(index) != board[i][j])
            return false;
        visited[i][j] = true;
        if(searchWord(board, i+1, j, word, index+1, visited) ||
           searchWord(board, i-1, j, word, index+1, visited) ||
           searchWord(board, i, j+1, word, index+1, visited) ||
           searchWord(board, i, j-1, word, index+1, visited))
            return true;
        return false;
    }
}
