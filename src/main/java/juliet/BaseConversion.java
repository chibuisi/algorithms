package juliet;

public class BaseConversion {
    public static void main(String[] args) {
        int [] arr =  {1,1,2};
        int result = convertToBaseTen(arr,3);
        System.out.println(result);
    }
    public static int convertToBaseTen(int [] arr, int base){
        int sum = 0;
        int power = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i] * pow(base,power);
            power--;
        }
        return sum;
    }

    private static int pow(int num, int base) {
        if(base == 0)
            return 1;
        else
            return num * pow(num, base - 1);
    }
}
