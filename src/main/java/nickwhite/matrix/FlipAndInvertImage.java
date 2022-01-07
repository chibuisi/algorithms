package nickwhite.matrix;

import java.util.Arrays;

public class FlipAndInvertImage {
    public static int[][] solve(int [][] matrix){
        if(matrix ==null || matrix.length == 0) return  matrix;

        for(int i = 0; i < matrix.length; i++){
            int left = 0;
            int right = matrix[0].length - 1;

            while(left <= right){
                if(matrix[i][left] == matrix[i][right]) {
                    matrix[i][left] = 1 - matrix[i][left];
                    matrix[i][right] = matrix[i][left];
                }
                left++;
                right--;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int [][] result = solve(matrix);
        for(int [] arr : result){
            System.out.println(Arrays.toString(arr));
        }
    }
}
