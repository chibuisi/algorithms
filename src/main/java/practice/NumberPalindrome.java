package practice;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(numberPalindrome(1011));
        System.out.println(numberPalindrome(10101));
    }

    public static Boolean numberPalindrome(int number){
        int temp = number;
        int rev = 0;
        while(number>0) {
            int dig = number % 10;
            rev = rev * 10 + dig;
            number = number/10;
        }
        return temp == rev;
    }
}
