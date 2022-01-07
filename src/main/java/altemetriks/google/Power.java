package altemetriks.google;

public class Power {
    public static int pow(int x, int n){
        if(n == 0)
            return 1;
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        return n % 2 == 0 ? pow(x*x, n/2) : x * pow(x*x, n/2);
    }

    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }
}
