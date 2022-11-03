package nickwhite.matrix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RotateImage {
    public static int[][] solve(int [][] matrix){
        if(matrix == null || matrix.length==0)
         return matrix;
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }

        Set<String> seen = new HashSet<>();
        return matrix;
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] result = solve(matrix);
        System.out.println();
        for(int [] arr : result){
            System.out.println(Arrays.toString(arr));
        }
    }
}
