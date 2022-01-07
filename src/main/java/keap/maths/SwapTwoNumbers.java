package keap.maths;

public class SwapTwoNumbers {
    public static void solution1(int num1, int num2){
        System.out.println("First Number Before -> " + num1);
        System.out.println("Second Number Before -> " + num2);

        if(num1 == num2)
            return;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("First Number After -> " + num1);
        System.out.println("Second Number After -> " + num2);
    }

    public static void solution2(int num1, int num2){
        System.out.println("First Number Before -> " + num1);
        System.out.println("Second Number Before -> " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("First Number After -> " + num1);
        System.out.println("Second Number After -> " + num2);
    }

    public static void main(String[] args) {
        solution1(7,7);
        solution2(7,7);
    }
}
