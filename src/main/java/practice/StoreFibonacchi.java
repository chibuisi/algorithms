package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StoreFibonacchi {
    public static void main(String[] args) {
        Object[] arr = getAllFibonacciTo(9);
        System.out.println(Arrays.toString(arr));
    }

    private static Object[] getAllFibonacciTo(int n) {
        List<Integer> fibs = new ArrayList<>();
        for(int idx = 1; idx <= n; idx++){
            fibs.add(fib(idx));
            //fib(idx);
        }
        return  fibs.toArray();
    }
    private static int fib(int n){
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        return fib(n-1) + fib(n-2);
    }

    private static int fib2(int num){
        int [] lastTwo = {0,1};
        int counter = 0;
        while(counter <= num){
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }
        return num > 1 ? lastTwo[1] : lastTwo[0];
    }
}
