package altemetriks.riot;

import java.util.Arrays;

public class AlternatePositiveNegativeNumbers {
    public static void main(String[] args) {
        int [] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        System.out.println(Arrays.toString(solutionOne(arr)));
    }
    public static int [] solutionOne(int [] array){
        int negIdx = 0;
        int posIdx = 0;
        //Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
        while(posIdx < array.length - 1){
            while(array[negIdx] >= 0 && negIdx < array.length-1){
                negIdx+=1;
            }
            posIdx = negIdx;
            while(array[posIdx] < 0 && posIdx < array.length-1){
                posIdx+=1;
            }
            int temp = array[negIdx];
            array[negIdx] = array[posIdx];
            array[posIdx] = temp;
        }
        return array;
    }
}
