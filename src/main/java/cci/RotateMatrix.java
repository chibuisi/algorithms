package cci;

public class RotateMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4,},
                {5,6,7,8,},
                {9,10,11,12,},
                {13,14,15,16}
        };
        rotateMatrix(arr);
        for(int[] ar: arr){
            for (int num : ar){
                System.out.print(num+", ");
            }
            System.out.println();
        }
    }
    public static void rotateMatrix(int[][]arr){
        int N = arr.length;
        //flip symmetrically
        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //flip horizontally
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][N-1-j];
                arr[i][N-1-j] = temp;
            }
        }
    }
}
