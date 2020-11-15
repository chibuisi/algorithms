package practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {2,64,3,46,6,10};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        for(int i = 0, j = arr.length-1; i < arr.length/2; i++,j--){
            //int tmp = arr[i];
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[j] ^ arr[i];
            arr[i] = arr[i] ^ arr[j];
        }
    }
}
