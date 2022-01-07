package codility;

import java.util.Arrays;

public class FrogRiverOne {
    public static void main(String[] args) {
        int [] arr = {1,3,1,4,2,3,5,4};
        System.out.println(solutionOne(arr,5));
    }
    public static int solutionOne(int [] A, int X){
        if(A.length == 0 || A == null)
            return 0;
        boolean [] seen = new boolean[X+1];
        for(int i = 0; i < A.length; i++){
            seen[A[i]] = true;
            boolean found = false;
            for(int k = 1; k < seen.length; k++){
                if(seen[k] == false)
                    found = true;
                    continue;
            }
            if(!found)
                return i;
        }
        return -1;
    }
}
