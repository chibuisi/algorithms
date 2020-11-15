package practice;

public class PorcupineNumber {
    public static void main(String[] args) {
        int number = findPorcupineNumber(139);
        System.out.println(number);
    }

    public static int findPorcupineNumber(int n){
        while(n < Integer.MAX_VALUE){
            int currValue = ++n;
            if(isPrime(currValue) == 1 && endsWithNine(currValue)){
                int nextPrime = findNextPrime(currValue);
                if(endsWithNine(nextPrime))
                    return currValue;
                else
                    continue;
            }
        }
        return -1;
    }

    private static int isPrime(int currValue) {
        if(currValue == 1)
            return 1;
        for(int i = 2; i < currValue; i++){
            if(currValue % i == 0){
                return 0;
            }
        }
        return 1;
    }

    private static int findNextPrime(int currValue) {
        while(++currValue < Integer.MAX_VALUE){
            if(isPrime(currValue) == 1){
                return currValue;
            }
        }
        return 0;
    }

    private static boolean endsWithNine(int currValue) {
        return currValue % 10 == 9;
    }
}
