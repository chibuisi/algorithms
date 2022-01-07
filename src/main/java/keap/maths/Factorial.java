package keap.maths;

public class Factorial {
    public static int solution1(int num){
        int result = 1;
        while(num > 0){
            result *= num;
            num--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution1(5));
    }
}
