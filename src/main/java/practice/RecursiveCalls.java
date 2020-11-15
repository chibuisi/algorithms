package practice;

public class RecursiveCalls {
    public static void main(String[] args) {
        int value = sum(4);
        System.out.println(value);
    }

    public static int sum(int n) {
        if(n == 1)
            return 1;
        return n + sum(n - 1);
    }
}
