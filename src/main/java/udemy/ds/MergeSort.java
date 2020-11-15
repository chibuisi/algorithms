package udemy.ds;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{4,5,2,4,0,2,9,1};
        sort(array, 0, 8);
        System.out.println(Arrays.toString(array));
    }
    public static void sort(int [] array, int start, int end){
        if(end - start < 2){
            return;
        }
        int mid = (start + end) / 2;
        sort(array,start,mid);
        sort(array,mid,end);
        merge(array,start, mid, end);
    }
    private static void merge(int[]arr, int start, int mid, int end){
        if(arr[mid-1] >= arr[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int [] temp = new int[end - start];
        while (i < mid && j < end){
            temp[tempIndex++] = arr[i] >= arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr, i, arr, start+tempIndex,mid-i);
        System.arraycopy(temp,0, arr, start, tempIndex);
    }
}
