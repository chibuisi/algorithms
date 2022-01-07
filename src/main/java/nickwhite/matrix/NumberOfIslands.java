package nickwhite.matrix;

import java.util.Arrays;

public class NumberOfIslands {
    public static int solve(char [][] matrix){
        if(matrix == null || matrix.length == 0)
            return 0;
        int count = 0, rows = matrix.length, cols = matrix[0].length;
        for(int i =0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    count+=1;
                    dfs(matrix, i, j);
                }
            }
        }
        return count;
    }

    private static void dfs(char [][] matrix, int i, int j){
        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || matrix[i][j] == '0')
            return;
        matrix[i][j] = '0';
        dfs(matrix,i+1,j);
        dfs(matrix,i-1,j);
        dfs(matrix,i,j+1);
        dfs(matrix,i,j-1);
    }

    public static void main(String[] args) {
        char [][] matrix = {
                {'1','0','0'},
                {'1','O','0'},
                {'1','1','O'}
        };
        System.out.println(solve(matrix));
        for(char [] ch : matrix){
            System.out.println(Arrays.toString(ch));
        }
    }
}
