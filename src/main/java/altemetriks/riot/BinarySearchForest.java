package altemetriks.riot;

import java.util.Arrays;

public class BinarySearchForest {
    public static void main(String[] args) {
        int [] arr = {2,3,6,2,4};
        //System.out.println(2-3);
        System.out.println(solutionOne(arr, 4));
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
}
