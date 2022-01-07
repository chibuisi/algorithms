package utils;

public class MathOps {
    /**
     * division
     * multiplication
     * power
     * mod
     */
    public static void main(String[] args) {
        //System.out.println(mul(3,2));
        //System.out.println(divUsingBits(10,3));
        //System.out.println(mod(5,2));
        System.out.println(pow(2,3 ));
        //System.out.println(sqrt(16));
        //System.out.println(subtract(5,3));
        //System.out.println(MaxInt());
        //System.out.println(div(MaxInt(),214748333));
    }
    public static int mul(int x, int y){
        int sum = 0;
        for(int i = 0; i < y; i++){
            sum += x;
        }
        return sum;
    }

    public static int div(int numer, int denom){
        int sum = denom;
        int count = 0;
        while(sum <= numer){
            if(denom > Integer.MAX_VALUE - sum)
                break;
            sum += denom;
            count++;
        }
        return count;
    }

    public static int divUsingBits(int numer, int denom){
        if(numer == Integer.MIN_VALUE && denom == -1)
            return Integer.MAX_VALUE;
        int result = 0;
        int a = Math.abs(numer);
        int b = Math.abs(denom);
        while(a - b >= 0){
            int x = 0;
            //int c = b << 1 << x;
            while(a - (b << 1 << x) >= 0){
                x++;
            }
            result += 1 << x;
            a -= b << x;
        }
        if (numer >= 0 && denom >= 0 || numer <= 0 && denom <= 0)
            return result;
        return -1 * result;
    }

    public static int mod(int numer, int denom){
        int div = numer / denom;
        return numer - div * denom;
    }

    public static int power(int a, int b){
        if(b < 0)
            return 0;
        if(b == 0)
            return 1;
        return a * power(a, b-1);
    }

    public static int pow2(int a, int b){
        int result = 1;
        b = Math.abs(b);
        for(int i = 0; i < b; i++){
            if(a > Double.MAX_VALUE - result)
                break;
            result *= a;
        }
        return result;
    }
    public static double pow(int a, int b){
        if(b == 0)
            return 1;
        if(b < 0){
            b = -b;
            a = 1/a;
        }
        return a * pow(a, b-1);
    }

    public static int sqrt(int number){
        return sqrtHelper(number, 1, number);
    }
    public static int sqrtHelper(int number, int min, int max){
        if(min > max)
            return -1;
        int guess = (min + max)/2;
        if(guess * guess == number)
            return guess;
        else if(guess * guess < number)
            return sqrtHelper(number,guess+1,max);
        else
            return sqrtHelper(number,min,guess-1);
    }
    public static int subtract(int num1, int num2){
        int count = 0;
        while(num2 != num1){
            num2++;
            count++;
        }
        return count;
    }
    public static int MaxInt(){
        return Integer.MAX_VALUE;
    }
    public static int MinInt(){
        return Integer.MIN_VALUE;
    }
}
