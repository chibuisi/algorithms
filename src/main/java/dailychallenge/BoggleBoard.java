package dailychallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BoggleBoard {
    public static void main(String[] args) {
        String [][] board ={
                {"A","B","C","E"},
                {"S","F","C","S"},
                {"A","D","E","E"}
        };//true
        String word = "ABCCED";
        System.out.println(search(board,word));
    }
    public static boolean isSafe(String [][] board, boolean[][] visited, int i, int j, String word, String l, int pos){
        return (i >= 0) && (j >= 0) && (i < board.length-1) && (j < board[0].length)
                && (!visited[i][j]) && (board[i][j].equals(l));
    }
    public static boolean BFS(String [][] board, boolean [][] visited, int i, int j, String word, String l, int pos){
        int [] row = {-1,0,0,1};
        int [] col = {0,-1,1,0};
        boolean result = false;
        Queue<Integer[]> queue = new LinkedList<>();
        queue.offer(new Integer[]{i,j});
        while(!queue.isEmpty()){
            Integer[] value = queue.poll();
            for(int k = 0; k < 4; k++){
                if(isSafe(board,visited,i+row[k], j+col[k], word, l, pos)){
                    visited[i+row[k]][j+col[k]] = true;
                    queue.offer(new Integer[]{i+row[k],j+col[k]});
                    result = true;
                }
            }
            if(result) pos++;
        }
        return result;
    }
    public static boolean search(String [][] board, String word){
        if(word.equals("")) return true;
        boolean [][] visited = new boolean[board.length][board[0].length];
        String firstLetter = word.charAt(0)+"";
        List<Integer[]> firstLetterOccurences = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j].equals(firstLetter)){
                    firstLetterOccurences.add(new Integer[]{i,j});
                }
            }
        }
        boolean result = false;
        for(Integer[] arr : firstLetterOccurences){
            int pos = 1;
            String l = word.charAt(pos)+"";
            result = BFS(board,visited,arr[0],arr[1],l,word,pos);
            if(result)
                break;
        }
        return result;
    }


}
