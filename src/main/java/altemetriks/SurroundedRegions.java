package altemetriks;

public class SurroundedRegions {
    public static void main(String[] args) {
        char [][] board = {
                {'X','X','X','X'},
                {'X','0','0','X'},
                {'0','X','0','X'},
                {'0','0','0','X'},
                {'0','0','X','X'}
        };
        solve(board);
        for(char [] arr : board){
            for(char c : arr)
                System.out.print(c);
            System.out.println();
        }
    }
    public static void solve(char [][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows; i++){
            if(matrix[i][0] == '0')
                callDFS(i, 0, matrix);
            if(matrix[i][rows-1] == '0')
                callDFS(i, rows-1, matrix);
        }
        for(int i = 0; i < cols; i++){
            if(matrix[0][i] == '0')
                callDFS(0, i, matrix);
            if(matrix[cols-1][i] == '0')
                callDFS(cols-1, i, matrix);
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == '0')
                    matrix[i][j] = 'X';
                if(matrix[i][j] == '*')
                    matrix[i][j] = '0';
            }
        }
    }
    public static void callDFS(int i, int j, char [][] matrix){
        if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[i].length || matrix[i][j] != '0')
            return;
        matrix[i][j] = '*';
        callDFS(i+1, j, matrix);
        callDFS(i-1, j, matrix);
        callDFS(i, j+1, matrix);
        callDFS(i, j-1, matrix);
    }
}
