package udemy.ds;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {20,35,-15,7,1,55,1,-22};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int [] arr){
        for(int unSortedPartion = arr.length - 1; unSortedPartion > 0; unSortedPartion--){
            for(int i = 0; i < unSortedPartion; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
