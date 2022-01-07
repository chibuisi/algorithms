package dailychallenge;

public class BAseConversion {
    public static int pow(int num, int base){
        if(base == 0)
            return 1;
        return num * pow(num, base - 1);
    }

    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }
}
