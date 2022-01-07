package geeks;
//check if a given number N has at least one odd divisor not exceeding N-1
//input 10 output true
//input 8 output false
public class OddDivisor {
    public static void main(String[] args) {
        System.out.println(oddDivisor(10));
    }
    public static boolean oddDivisor(int num){
        int x = num;
        //reduce num by 2
        //I don't know why either
        while(num % 2 == 0)
            num /= 2;
        for(int i = 3; i * i <= x; i+=2){
            if(num % i == 0)
                return true;
        }
        if(num != x)
            return true;
        return false;
    }

    public static boolean oddDivisor2(int num){
        for(int i = 3; i < num; i+=2){
            if(num % i == 0)
                return true;
        }
        return false;
    }
}
