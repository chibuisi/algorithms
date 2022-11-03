package codesignal;

public class Arcade {
    static int sumOfDigitsInNumber(int n) {
        int one = n % 10;
        int two = n/10;
        return one + two;
    }

    static int noOfNines(int n) {
        int result = 10;
        while(n > 1){
            result *= 10;
            n -= 1;
        }
        return n == 0 ? 0 : result-1;
    }

    static int lateRide(int n) {

        int hour = n / 60;
        int min = n % 60;

        return hour/10 + hour%10 + min/10 + min%10;
    }


    public static void main(String[] args) {
        //System.out.println(sumOfDigitsInNumber(48));
        //System.out.println(noOfNines(0));
        System.out.println(lateRide(808));
    }
}
