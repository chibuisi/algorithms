package keap;

public class Fibonacci {
    //fib(0) = 0
    //fib(1) = 1
    //fib(n) = fib(n-1) + fib(n-2)
    private static int fib(int num){
        if(num <= 1)
            return num;
        return fib(num - 1) + fib(num - 2);
    }

    private static int fib2(int num){
        int [] lastTwo = {0,1};
        int counter = 1;
        while(counter < num)
        {
            int next = lastTwo[1] + lastTwo[0];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = next;
            counter+=1;
        }

        return num > 0 ? lastTwo[1] : lastTwo[0];
    }

    public static void main(String[] args) {
        System.out.println(fib2(10));
    }
}
