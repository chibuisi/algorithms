package keap.memoization;

public class Fibonacci {
    public static int solution1(int num){
        int [] lastTwo = {0,1};
        int counter = 1;
        while(counter < num){
            int next = lastTwo[1] + lastTwo[0];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = next;
            counter++;
        }
        return num > 0 ? lastTwo[1] : lastTwo[0];
    }

    public static void main(String[] args) {
        System.out.println(solution1(10));
    }
}
