package nickwhite.matrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static int [][] solve(int [][] arr){
        if(arr.length == 0) return null;
        int rows = arr.length;
        int columns = arr[0].length;
        int [][] res = new int[columns][rows];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                res[j][i] = arr[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8}
        };
        int [][] result = solve(arr);
        for(int [] ar : result){
            for(int i : ar){
                System.out.print(i + " - ");
            }
            System.out.println();
        }
    }
}
