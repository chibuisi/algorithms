package practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,1,90,3,44,5,-3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int unsortedPartion = arr.length; unsortedPartion > 0; unsortedPartion--){
            int index = 0;
            while(index < unsortedPartion - 1){
                if(arr[index] > arr[index+1]){
                    swap(arr,index,index+1);
                }
                index++;
            }
        }
    }

    private static void swap(int[]arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
