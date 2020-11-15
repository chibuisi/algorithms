package udemy.ds;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {20,35,-15,7,1,55,1,-22};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int [] arr){
        for(int unSortedIndex = arr.length -1; unSortedIndex > 0; unSortedIndex--){
            int largest = 0;
            for(int i = 1; i < unSortedIndex; i++){
                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }
            swap(arr,largest,unSortedIndex);
        }
    }
    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
