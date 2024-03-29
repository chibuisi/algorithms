package riotgames.practice;

public class PowerOfX {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
    public static double power(double x, int n){
        if(n == 0)
            return 1;
        if(n < 0){
            n = -n;
            x = 1/x;
        }
        return n % 2 == 0 ? power(x*x, n/2) : x * power(x*x, n/2);
    }
}
