package codility;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        int [] arr = {3,8,9,7,6};
        System.out.println(Arrays.toString(solutionOne(arr, 2)));
    }
    public static int[] solutionOne(int [] A, int k){
        if(A.length == 0 || A == null)
            return A;
        while(k > 0){
            int temp = A[A.length-1];
            int position = A.length-1;
            for(int i = position; i > 0; i--){
                A[position] = A[position-1];
                position--;
            }
            A[0] = temp;
            k--;
        }

        return A;
    }
}
