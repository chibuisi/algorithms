package nickwhite.matrix;

import java.util.Arrays;

public class ReshapeMatrix {
    public static int [][] solve(int [][] matrix, int r, int c){
        int rows = matrix.length, cols = matrix[0].length;
        if(rows * cols != c) return new int[][]{};

        int [][] result = new int[r][c];
        int rowIndex = 0, colIndex =0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[rowIndex][colIndex] = matrix[i][j];
                colIndex++;
                if(colIndex == c){
                    colIndex = 0;
                    rowIndex++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [][] arr = {
                {1,2},
                {3,4}
        };
        int [][] result = solve(arr, 1,4);
        for(int [] a : result){
            System.out.println(Arrays.toString(a));
        }
    }
}
