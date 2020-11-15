package google;

import java.util.Arrays;

public class ContiguousArray {
    public static void main(String[] args) {
        int [] arr = new int[]{1,4,3,2,5};
        int [] res = isContiguous(arr,4);
        System.out.println(Arrays.toString(res));
    }
    public static int[] isContiguous(int[]arr, int k){
        int count = k;
        int pos = 0;
        int sum = 0;
        int largest = 0;
        int index = 0;
        for(int i = 0; i < arr.length-k+1; i++){
            index = i;
            for(int j = 0; j < count && index <= arr.length; j++){
                sum += arr[index];
                index++;
            }
            if(sum > largest){
                largest = sum;
                pos = i;
                sum = 0;
            }
        }
        int [] res = new int[k];
        for(int i=0; i < k; i++){
            res[i] = arr[pos];
            pos++;
        }
        return res;
    }
}
