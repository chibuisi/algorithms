package altemetriks.riot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArrayByDCounterClockwise {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(solutionOne(arr,2)));
    }
    public static int [] solutionOne(int [] array, int d){
        int [] result = new int [array.length];
        int index = 0;
        for(int i = d; i < array.length; i++){
            result[index++] = array[i];
        }
        for(int i = 0; i < d; i++){
            result[index++] = array[i];
        }
        return result;
    }
    public static int [] solutionTwo(int [] array, int d){
        while(d > 0){
            int temp = array[0];
            for(int i = 1; i < array.length; i++){
                array[i-1] = array[i];
            }
            array[array.length-1] = temp;
            d--;
        }
        return array;
    }
}
