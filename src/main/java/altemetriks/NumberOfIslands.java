package altemetriks;

public class NumberOfIslands {
    public static void main(String[] args) {
        char grid [][] = {
                {'1', '1', '0', '1', '1'},
                {'0', '1', '0', '0', '1'},
                {'1', '0', '0', '1', '1'},
                {'0', '0', '0', '0', '0'},
                {'1', '0', '1', '0', '1'}};
        System.out.println(solve(grid));
    }
    public static int solve(char [] [] grid){
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    count += 1;
                    callBFS(i,j,grid);
                }
            }
        }
        return count;
    }
    public static void callBFS(int i, int j, char [][] grid){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] != '1')
            return;
        grid[i][j] = '0';
        callBFS(i+1, j, grid);
        callBFS(i-1, j, grid);
        callBFS(i, j+1, grid);
        callBFS(i, j-1, grid);
    }
}
