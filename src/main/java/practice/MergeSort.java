package practice;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {2,1,90,3,44,5,-3};
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int start, int end) {
        if(end - start < 2){
            return;
        }
        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr,mid,end);
        merge(arr, start, mid, end);

        }
    private static void merge(int[] arr, int start,int mid, int end) {
        int [] temp = new int[end-start];
        if(arr[mid-1] <= arr[mid])
            return;
        int tempIndex = 0;
        int i = start;
        int j = mid;
        while(i < mid && j < end){
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr, i, arr, start+tempIndex,mid-i);
        System.arraycopy(temp,0, arr, start, tempIndex);
    }
}
