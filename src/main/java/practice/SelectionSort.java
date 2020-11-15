package practice;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {2,1,90,3,44,5,-3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for(int lastSortedPatition = arr.length-1; lastSortedPatition > 0; lastSortedPatition--){
            int largest = 0;
            for(int i = 1; i <= lastSortedPatition; i++){
                if(arr[i] > arr[largest])
                    largest = i;
            }
            swap(arr,largest,lastSortedPatition);
        }
    }

    private static void swap(int[]arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
