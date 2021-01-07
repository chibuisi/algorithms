package practice;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(13231));
        //play(13231);
    }

    public static boolean isPalindrome(int num){
        if(num == 0) return true;
        if(num < 0 || num % 10 == 0)
            return false;
        int reversed = 0;
        while(num > reversed){
            int temp = num % 10;
            reversed = reversed * 10 + temp;
            num /= 10;
        }
        return (num == reversed || num == reversed/10) ? true : false;
    }

    private static void play(int num){
        int count = 0;
        while(num > count){
            int temp = num % 10;
            num /= 10;
            count = count * 10 + temp;
            System.out.println(count);
        }
        System.out.println(num);
    }
}
