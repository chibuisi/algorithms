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
        String [][] board ={
                {"A","B","C","E"},
                {"S","F","C","S"},
                {"A","D","E","E"}
        };//true
        String word = "ABCCED";
        BoggleBoard ob = new BoggleBoard();
        System.out.println(ob.searchWord(board,word));
    }
    public boolean searchWord(String [][] board, String word){
        boolean [][] visited = new boolean[board.length][board[0].length];
        String letter = word.charAt(0)+"";
        List<Integer> letterIndex = searchFirstLetterIndex(letter,board);
        if(letterIndex.size() == 0) return false;
        int currRow = letterIndex.get(0);
        int currCol = letterIndex.get(1);

        for(int i = 0; i < word.length() - 1; i++){
            letter = word.charAt(i)+"";
            String nextLetter = word.charAt(i+1)+"";

            Queue<String> queue = new LinkedList<>();

            List<String> neighbours = getNeighbours(board,letterIndex);

            if(!neighbours.contains(nextLetter))
                return false;

            for(String s : neighbours){
                queue.add(s);
            }

            boolean foundUnvisitedIndex = false;
            while(!queue.isEmpty()){

                String let = queue.poll()+"";

                letterIndex = getLetterIndex(nextLetter,currRow,currCol,board);

                currRow = letterIndex.get(0);
                currCol = letterIndex.get(1);

                if(!visited[currRow][currCol]){
                    foundUnvisitedIndex = true;

                }
                visited[currRow][currCol] = true;
                if(foundUnvisitedIndex)
                    break;
            }
            if(!foundUnvisitedIndex)
                return false;


        }
        return true;
    }

    public List<Integer> searchFirstLetterIndex(String currWord, String[][]board){
        List<Integer> indices = new ArrayList<>();
        boolean found = false;
        for(int i = 0; i < board.length-1; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j].equals(currWord)){
                    indices.add(i);
                    indices.add(j);
                    found = true;
                }
            }
            if(found) break;
        }
        return indices;
    }

    public List<String> getNeighbours(String[][] board, List<Integer> letterIndices){
        List<String> neighbours = new ArrayList<>();
        int row = letterIndices.get(0);
        int col = letterIndices.get(1);

        //bootom neighbour
        if(row < board.length-1)
            neighbours.add(board[row+1][col]);
        //left neighbour
        if(col > 0)
            neighbours.add(board[row][col-1]);
        //top neighbour
        if(row > 0)
            neighbours.add(board[row-1][col]);
        //right neighbour
        if(col < board[0].length-1)
            neighbours.add(board[row][col+1]);

        return neighbours;
    }

    public List<Integer> getLetterIndex(String nextLetter, int currRow, int currCol, String [][]board){
        List<Integer> list = new ArrayList<>();
        //top
        if(currRow > 0 && board[currRow - 1][currCol].equals(nextLetter)){
            list.add(currRow - 1);
            list.add(currCol);
        }

        //right
        else if(currCol < board[0].length-1 && board[currRow][currCol + 1].equals(nextLetter)){
            list.add(currRow);
            list.add(currCol + 1);
        }
        //left
        else if(currCol > 0 && board[currRow][currCol - 1].equals(nextLetter)){
            list.add(currRow);
            list.add(currCol - 1);
        }
        //bottom
        else if(currRow < board.length - 1 && board[currRow + 1][currCol].equals(nextLetter)) {
            list.add(currRow);
            list.add(currCol + 1);
        }
        return list;
    }

}
