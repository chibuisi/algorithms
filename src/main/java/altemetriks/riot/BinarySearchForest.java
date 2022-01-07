package altemetriks.riot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinarySearchForest {
    public static void main(String[] args) {
        int [] arr = {2,3,6,2,4};
        //System.out.println(2-3);
        System.out.println(solutionThree(arr, 4));
    }
    public static int solutionOne(int [] array, int k){
        int total = Arrays.stream(array).sum();

        int currHeight = 1;
        while(true) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i] > currHeight ? array[i] - currHeight : 0;
            }
            if(sum == currHeight)
                return currHeight;
            currHeight++;
        }
    }

    public static int solutionTwo(int [] array, int k){
        for(int i = 0; i < 1000; i++){
            int sum = 0;
            for(int j = 0; j < array.length; j++){
                sum += array[j] > i ? array[j] - i : 0;
            }
            if(sum == k)
                return i;
        }
        return -1;
    }

    public static int solutionThree(int [] array, int k){
        Arrays.sort(array);
        return binarySearch(array, k,0, array.length-1);
    }

    private static int binarySearch(int[] array, int k, int start, int end) {
        if(start > end)
            return -1;

        int mid = start + (end - start)/2;
        int sum = 0;
        for(int i = array.length-1; i >= 0; i--){
            sum += array[i] > mid ? array[i] - mid : 0;
        }

        if(sum == k)
            return mid;
        else if(sum > k)
            return binarySearch(array, k, mid + 1,end);
        else
            return binarySearch(array, k, start, mid - 1);
    }
}
