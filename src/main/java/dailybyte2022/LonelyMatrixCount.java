package dailybyte2022;

public class LonelyMatrixCount {
    public static int solve(int [][] arr){
        int result = 0;
        int row = 0, col = 0;
        while(row < arr.length){
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i][col] == 1)
                    count++;
            }
            for(int i = 0; i < arr[0].length; i++){
                if(arr[row][i] == 1)
                    count++;
            }
            if(count == 2)
                result++;
            row++;
            col++;
        }
        return result;
    }

    public static void main(String[] args) {
        int [][] arr = {{1, 0, 1},
                        {0, 1, 0},
                        {0, 0, 1}};
        int [][] arr2 = {{1, 0, 0},
                        {0, 1, 0},
                        {0, 0, 1}};
        System.out.println(solve(arr));
        System.out.println(solve(arr2));
    }
}
