package altemetriks.riot;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        System.out.println(solutionOne(arr));
        System.out.println(solutionTwo(arr));
        System.out.println(solutionThree(arr));
    }
    public static int solutionOne(int [] array){
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            if(i > 0 && array[i] - array[i-1] > 1){
                return array[i-1] + 1;
            }
        }
        return -1;
    }

    public static int solutionTwo(int [] array){
        //using total = n(n+1)/2 = (n+1)(n+2)/2
        int n = array.length;
        int total = (n+1)*(n+2)/2;
        for(int i : array){
            total -= i;
        }
        return total;
    }

    public static int solutionThree(int [] array){
        int x1 = array[0]; //array[0] - array[N]
        int x2 = 1; //1 - N+1
        for(int i = 1; i < array.length; i++){
            x1 ^= array[i];
        }
        for(int i = 2; i <= array.length+1; i++){
            x2 ^= i;
        }
        return x1 ^ x2;
    }
}
