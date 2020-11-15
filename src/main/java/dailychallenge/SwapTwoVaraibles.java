package dailychallenge;

public class SwapTwoVaraibles {
    public static void main(String[] args) {
        int x = 9;
        int y = 5;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;


        System.out.println("X = "+x);
        System.out.println("Y = "+y);
    }
}
