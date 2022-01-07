package codility;

import java.util.Arrays;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int [] arr = {3,1,2,4,3};
        System.out.println(solutionOne(arr));
    }
    public static int solutionOne(int [] A){
        if(A.length == 0 || A == null)
            return 0;
        int total = Arrays.stream(A).sum();
        int runningSum = 0;
        int minDiff = 100000;
        for(int i = 0; i < A.length; i++){
            runningSum += A[i];
            int diffSumToIndex = total - runningSum;
            int diff = Math.abs(runningSum - diffSumToIndex);
            minDiff = diff < minDiff ? diff : minDiff;
        }
        return minDiff;
    }
}
