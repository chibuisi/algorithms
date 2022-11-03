package dailybyte2022;

public class AddStringNumbers {
    //given two number strings, add both and return sum
    //eg "105" + "1", return "106"
    //"141" + "18", return "159"
    //"1" + "0", return  "1"

    public static void main(String[] args) {
        System.out.println(solve("105","1"));
        System.out.println(solve("141","18"));
        System.out.println(solve("1","0"));
    }

    public static String solve(String a, String b){
        StringBuilder result = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while(i >= 0 || j >= 0){
            int sum = 0;
            if(i >= 0)
                sum += a.charAt(i--) - '0';
            if(j >= 0)
                sum += b.charAt(j--) - '0';
            sum = (sum + carry) % 10;
            carry = sum / 10;
            result.append(sum);
        }
        if (carry > 0)
            result.append(carry);
        return result.reverse().toString();
    }
}
