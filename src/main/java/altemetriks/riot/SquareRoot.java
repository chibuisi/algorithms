package altemetriks.riot;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(solutionOne(9));
    }
    public static int solutionOne(int num){
        return binarySearch(num, 0, num);
    }

    private static int binarySearch(int num, int start, int end) {
        if(start > end)
            return 0;
        int guess = start + (end - start)/2;
        if(guess * guess == num)
            return guess;
        else if(guess * guess > num)
            return binarySearch(num, start, guess-1);
        else
            return binarySearch(num, guess+1, end);
    }
}
