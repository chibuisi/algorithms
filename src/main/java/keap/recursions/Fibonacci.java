package keap.recursions;

public class Fibonacci {
    public static int fibonacci(int num){
        if(num <= 1)
            return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
