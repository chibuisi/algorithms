package altemetriks.riot;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(solutionOne(arr)));
    }
    public static int[] solutionOne(int [] array){
        for(int i = 1; i < array.length-1; i+=2){
            if(array[i] > array[i+1])
                swap(array, i,i+1);
            if(array[i] > array[i-1])
                swap(array, i, i-1);
        }
        return array;
    }
    public static void swap(int [] array, int i, int j){
        array[i] = array[i] ^ array[j];
        array[j] = array[i] ^ array[j];
        array[i] = array[i] ^ array[j];
    }
}
