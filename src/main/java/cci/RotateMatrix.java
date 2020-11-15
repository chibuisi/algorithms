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
        int sR = 0;
        int sC = 0;
        int eR = arr.length - 1;
        int eC = arr[0].length - 1;

        while(sR <= eR && sC <= eC){
            for(int row = sR; row < eR; row++){
                int value = arr[sR][sC];
                arr[sR][sC] = arr[eR][sC];
                arr[eR][sC] = arr[eR][eC];
                arr[eR][eC] = arr[sR][eC];
                arr[sR][eC] = value;
            }


            sR++;
            sC++;
            eR--;
            eC--;
        }
    }
}
