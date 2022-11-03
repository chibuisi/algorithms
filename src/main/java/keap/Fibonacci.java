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

    public static int fib3(int num){
        if(num <= 0)
            return num;
        int step1 = 0, step2 = 1;
        while(num > 1){
            int currStep = step1 + step2;
            step1 = step2;
            step2 =currStep;
            num--;
        }
        return step2;
    }
    public static void main(String[] args) {
        System.out.println(fib2(3));
        System.out.println(fib2(2));
        System.out.println(fib3(3));
        System.out.println(fib3(2));
    }
}
