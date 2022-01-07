package codility;

import java.util.Arrays;

public class axCounters {
    public static void main(String[] args) {
        int [] arr = {3,4,4,6,1,4,4};
        System.out.println(Arrays.toString(solutionOne(arr,5)));
    }
    public static int [] solutionOne(int [] A, int N){
        int [] result = new int[N];
        for(int i = 0; i < A.length; i++){
            if(A[i] <= N){
                increment(A[i]-1, result);
            }
            else if(A[i] > N){
                maxCounter(result);
            }
        }
        return result;
    }
    private static void increment(int x, int [] array){
        array[x]++;
    }
    private static void maxCounter(int [] array){
        int max = Arrays.stream(array).max().getAsInt();
        for(int i = 0; i < array.length; i++){
            if(array[i] < max)
                array[i] = max;
        }
    }
}
