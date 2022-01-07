package riotgames.practice;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(25));
    }
    public static int sqrt(int num){
        return sqrt(num, 1, num);
    }

    public static int sqrt(int num, int min, int max){
        int guess = (min + max) / 2;
        if(guess * guess == num)
            return guess;
        if(guess * guess > num)
            return sqrt(num, min, guess-1);
        else{
            return sqrt(num, guess+1, max);
        }
    }
}
