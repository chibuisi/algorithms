package dailychallenge;

import java.util.LinkedList;
import java.util.Queue;

public class GraphIslands {
    public static void main(String[] args) {
        int arr [][] = {{1, 1, 0, 1, 1},
                        {0, 1, 0, 0, 1},
                        {1, 0, 0, 1, 1},
                        {0, 0, 0, 0, 0},
                        {1, 0, 1, 0, 1}};
        System.out.println(countIslands(arr));
    }
    public static boolean isSafe(int [][] matrix, int i, int j, boolean [][] visited){
        return (i >= 0) && (j >= 0) && (i < matrix.length-1) && (j < matrix[0].length-1)
                && matrix[i][j] == 1 && (!visited[i][j]);
    }
    public static void BFS(int [][] matrix, boolean [][] visited, int i, int j){
        int [] row = {-1,-1,-1,0,0,1,1,1};
        int [] col = {-1,0,1,-1,1,-1,0,1};
        Queue<Integer[]> queue = new LinkedList<>();
        Integer [] array = {i,j};
        queue.add(array);
        while(!queue.isEmpty()){
            Integer[] values = queue.poll();
            for(int k = 0; k < 8; k++){
                if(isSafe(matrix, row[k], col[k], visited)){
                    visited[i + row[k]][j + col[k]] = true;
                    Integer[] arr = {i + row[k], j + col[k]};
                    queue.add(arr);
                }
            }
        }
    }
    public static int countIslands(int [][] matrix){
        int count = 0;
        boolean [][] visited = new boolean[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(isSafe(matrix, i, j, visited)){
                    BFS(matrix,visited,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}
