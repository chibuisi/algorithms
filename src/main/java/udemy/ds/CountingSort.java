package udemy.ds;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int [] arr = new int[]{4,2,9,0,5};
        sort(arr,9);
    }
    public static void sort(int [] arr, int k){
        int [] countArray = new int[k+1];
        for(int i = 0; i < arr.length; i++){
            ++countArray[arr[i]];
        }
        int pos = 0;
        for(int i = 0; i < countArray.length; i++){
            for(int j = countArray[i]; j > 0; j--){
                arr[pos++]=i;
            }
        }
        System.out.println(Arrays.toString(countArray));
        System.out.println(Arrays.toString(arr));
    }
}
