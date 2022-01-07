package keap.maths;

public class ReverseDigits {
    public static int solution1(int num){
        int result = 0;
        while(num > 1){
            int temp = num % 10;
            result = result * 10 + temp;
            num = num / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution1(342));
    }
}
