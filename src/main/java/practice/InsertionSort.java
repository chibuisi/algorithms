package practice;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {2,1,90,3,44,5,-3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for(int sortedIndex = 1; sortedIndex < arr.length; sortedIndex++){
            int newItem = arr[sortedIndex];
            int i;
            for(i = sortedIndex; i > 0 && arr[i-1] > newItem; i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newItem;
        }
    }
}
