package riotgames.practice;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        System.out.println(1<<0);
    }
    public static int divide(int dividend, int divisor){
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int result = 0;

        while(a - b >= 0){
            int x = 0;
            while (a - (b << 1 << x) >= 0) {
                x++;
            }
            result += 1 << x;
            a -= b << x;
        }
        if(dividend < 0 && divisor < 0 || dividend > 0 && divisor > 0){
            return result;
        }
        return -result;
    }
}
