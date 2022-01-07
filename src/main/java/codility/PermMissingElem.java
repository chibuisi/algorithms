package codility;

public class PermMissingElem {
    public static void main(String[] args) {
        int [] arr = {2,3,1,5};
        System.out.println(solutionOne(arr));
    }
    public static int solutionOne(int [] A){
        if(A.length == 0 || A == null)
            return 0;
        int x1 = A[0];
        int x2 = 1;
        for(int i = 1; i < A.length; i++){
            x1 ^= A[i];
        }
        for(int i = 2; i <= A.length+1; i++){
            x2 ^= i;
        }
        return x1 ^ x2;
    }

    public static int solutionTwo(int [] array){
        int total = ((array.length + 1)*(array.length+2))/2;
        for(int i = 0; i < array.length; i++){
            total -= array[i];
        }
        return total;
    }
}
