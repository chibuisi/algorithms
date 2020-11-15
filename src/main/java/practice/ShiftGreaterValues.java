package practice;

import java.util.Arrays;

public class ShiftGreaterValues {
    public static void main(String[] args) {
        int[]arr = {20,3,4,10,34,8,32,3};
        shiftLessAndGreaterValues(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shiftLessAndGreaterValues(int[] arr) {
        int pivot = arr[0];
        int i = 0;
        int j = arr.length;
        while(i < j){
            while(i < j && arr[--j] >= pivot);
            if(i < j)
                arr[i] = arr[j];
            while(i < j && arr[++i] <= pivot);
            if(i < j)
                arr[j] = arr[i];
        }
        arr[j] = pivot;
    }
}
