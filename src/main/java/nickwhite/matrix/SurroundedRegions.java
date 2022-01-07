package nickwhite.matrix;

import java.util.Arrays;

public class SurroundedRegions {
    public static void solve(char [][] matrix){
        if(matrix == null || matrix.length == 0)
            return;
        int rows = matrix.length, cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            if(matrix[i][0] == 'O')
                dfs(matrix, i, 0);
            if(matrix[i][cols-1] == 'O')
                dfs(matrix, i, cols-1);
        }
        for(int i = 0; i < cols; i++){
            if(matrix[0][i] == 'O')
                dfs(matrix, 0, i);
            if(matrix[rows-1][i] == 'O')
                dfs(matrix, rows-1, i);
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 'O')
                    matrix[i][j] = 'X';
                else if(matrix[i][j] == '*')
                    matrix[i][j] = 'O';
            }
        }
    }

    private static void dfs(char [][] matrix, int i, int j){
        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix.length)
            return;
        if(matrix[i][j] == 'O')
            matrix[i][j] = '*';
        if(i > 0 && matrix[i-1][j] == '0')
            dfs(matrix, i-1, j);
        if(i < matrix.length-1 && matrix[i+1][j] == '0')
            dfs(matrix, i+1, j);
        if(j > 0 && matrix[i][j-1] == '0')
            dfs(matrix, i, j-1);
        if(j < matrix[0].length-1 && matrix[i][j+1] == '0')
            dfs(matrix, i, j+1);
    }

    public static void main(String[] args) {
        char [][] matrix = {
                {'X','X','X'},
                {'X','O','X'},
                {'X','X','O'}
        };
        solve(matrix);
        for(char [] ch : matrix){
            System.out.println(Arrays.toString(ch));
        }
    }
}
