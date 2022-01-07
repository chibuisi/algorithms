package dailychallenge;

public class CountOddNumbers {
    public static int countOdds(int num){
        int count = 0;
        //implement method here

        do{
            int rem = num%10;
            if(rem % 2 != 0){
                count++;
            }num /= 10;

        }while (num > 0);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOdds(84));
    }
}
