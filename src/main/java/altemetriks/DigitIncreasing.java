package altemetriks;

public class DigitIncreasing {
    public static int isDigitIncreasing(int num) {
        for(int i = 1; i <= 9; i++) {
            int sum = i;
            int times = 10;
            int lastSum = i;
            while(sum < num) {
                int value = i * times + lastSum;
                times*=10;
                lastSum = value;
                sum+= value;
            }
            if(sum == num)
                return 1;
        }
        return 0;
    }

}
