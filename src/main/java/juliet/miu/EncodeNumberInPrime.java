package juliet.miu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeNumberInPrime {
    public static void main(String[] args) {
        System.out.println(encodeNumber(1200));
    }
    public static List<Integer> encodeNumber(int n){
        if(n <= 1)
            return null;
        List<Integer> primeNums = getAllPrimes(n);

        List<Integer> result = new ArrayList<>();
        int index = 0;
        while(n > 1){
            int currPrime = primeNums.get(index);
            while(n % currPrime == 0){
                result.add(currPrime);
                n = n / currPrime;
            }
            index += 1;
        }
        return result;
    }

    private static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    private static List<Integer> getAllPrimes(int n){
        List<Integer> primes = new ArrayList<>();
        int index = 0;
        for(int i = 2; i < n; i++){
            if(isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

}
