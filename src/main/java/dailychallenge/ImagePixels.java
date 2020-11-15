package dailychallenge;

import java.util.LinkedList;
import java.util.Queue;

public class ImagePixels {
    public static void main(String[] args) {
        int [][] image = {
                {1, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0}
        };
        removePixels(image);
        for(int [] arr : image){
            for(int i : arr){
                System.out.print(i+", ");

            }
            System.out.println();
        }
    }
    public static boolean isSafe(int [][] image, boolean [][] visited, int i, int j){
        return i > 0 && i < image.length-1 && j > 0 && j < image[0].length-1 && !visited[i][j] &&
        image[i][j] == 1;
    }
    public static void BFS(int [][] image, boolean [][] visited, int i, int j){
        int [] row = {-1,0,1,0};
        int [] col = {0,-1,0,1};
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{i,j});
        while(queue.isEmpty()){
            Integer[] indices = queue.poll();
            for(int k = 0; k < 4; k++){
                if(isSafe(image, visited, i + row[k], j + col[k])){
                    visited[i + row[k]][j + row[k]] = true;
                    image[i][j] = 0;
                    queue.add(new Integer[]{i + row[k], j + col[k]});
                }
            }
        }
    }
    public static void removePixels(int [][] image){
        boolean [][] visited = new boolean[image.length][image[0].length];
        for(int i = 1; i < image.length; i++){
            for(int j = 1; j < image[i].length; j++){
                if(i == 0 || j == 0 && image[i][j] == 1)
                    continue;
                else{
                    if(isSafe(image, visited, i,j)){
                        BFS(image, visited, i, j);
                        //image[i][j] = 0;
                    }
                }
            }
        }
    }
}
