package udemy.ds;

import java.math.BigInteger;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {20,35,-15,7,1,55,1,-22};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int [] arr){
        for(int sortedIndex = 1; sortedIndex < arr.length; sortedIndex++){
            int valueFirstUnsorted = arr[sortedIndex];
            int i;
            for(i = sortedIndex; i > 0 && arr[i-1] > valueFirstUnsorted; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = valueFirstUnsorted;
        }
    }
}
