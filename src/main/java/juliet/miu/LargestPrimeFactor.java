package juliet.miu;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(8));
    }
    public static int largestPrimeFactor(int n){
        if(n <= 1)
            return 0;
        int largestPrime = 0;
        for(int i = 2; i < n; i++){
            if(isPrime(i) && n % i == 0)
                largestPrime = i;
        }
        return largestPrime;
    }
    private static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
