package nickwhite.matrix;

public class NoOfPixels {
    public static int solve(int [][] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 1){
                    count+=1;
                    callBFS(arr, i, j);
                }
            }
        }
        return count;
    }
    private static void callBFS(int [][] arr, int i, int j){
        if(i < 0 || i > arr.length-1 || j < 0 || j > arr[0].length-1 || arr[i][j] == 0)
            return;
        arr[i][j] = 0;
        callBFS(arr, i+1, j);
        callBFS(arr, i-1, j);
        callBFS(arr, i, j+1);
        callBFS(arr, i, j-1);
    }

    public static void main(String[] args) {
        int [][] arr = {
                {0,1,1,1},
                {0,0,1,0},
                {1,0,0,0},
                {1,1,0,0}
        };
        System.out.println(solve(arr));
    }
}
