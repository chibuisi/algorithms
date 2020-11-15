package practice;

import java.util.Arrays;
//Example 6 Pg 59
public class ArrayManipulations {
    public static void main(String[] args) {
        int [] arr= {2,4,6,8,10,12,14,15,16,18,19};
        //removeLastIndex(arr);
        //shiftvaluesFrom(arr,2);
        searchAndInsert(arr,14,20);
        System.out.println(Arrays.toString(arr));
    }
    public static void removeLastIndex(int[]arr){
        arr[arr.length-1] = Integer.MIN_VALUE;
        int[] res = new int[arr.length-1];
        for(int i = 0; i < arr.length - 1; i++){
            res[i] = arr[i];
        }
        //System.arraycopy();
        System.out.println(Arrays.toString(res));
    }
    public static void shiftvaluesFrom(int[]arr, int pos){
        for(int i=pos; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        //arr[arr.length-1] = -1;
    }

    public static void searchAndInsert(int [] arr, int start, int end){
        int largest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int i = start;
        while(i <= end && i < arr.length-1){
            if(end > arr.length - 1){
                end = arr.length - 1;
            }
            arr[i] = largest;
            i++;
        }
    }
}
