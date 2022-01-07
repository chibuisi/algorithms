package nickwhite.matrix;

import java.util.Arrays;

public class GenerateSpiralMatrix {
    public static int[][] solve(int n){
        int [][] matrix = new int[n][n];
        if(n == 0) return matrix;

        int rowBegin = 0, rowEnd = n-1;
        int colBegin = 0, colEnd = n-1;

        int counter = 1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            for(int i = colBegin; i <= colEnd; i++){
                matrix[rowBegin][i] = counter++;
            }
            rowBegin++;
            for(int i = rowBegin; i <= rowEnd; i++){
                matrix[i][colEnd] = counter++;
            }
            colEnd--;
            if(rowBegin <= rowEnd){
                for(int i = colEnd; i >= colBegin; i--){
                    matrix[rowEnd][i] = counter++;
                }
                rowEnd--;
            }
            if(colBegin <= colEnd){
                for(int i = rowEnd; i >= rowBegin; i--){
                    matrix[i][colBegin] = counter++;
                }
                colBegin++;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int [][] result = solve(2);
        for(int [] arr : result){
            System.out.print("{");
            for(int n : arr){
                System.out.print(n+",");
            }
            System.out.println("}");
        }
        System.out.println();
        for(int [] a: result){
            System.out.println(Arrays.toString(a));
        }
    }
}
