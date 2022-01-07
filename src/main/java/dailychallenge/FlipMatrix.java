package dailychallenge;

import java.util.Arrays;

public class FlipMatrix {
    public static int [][] solve(int [][] matrix){
        if(matrix == null || matrix.length == 0) return matrix;
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] result = solve(matrix);
        for(int [] arr : result){
            System.out.println(Arrays.toString(arr));
        }
    }
}
