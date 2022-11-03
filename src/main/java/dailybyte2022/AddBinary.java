package dailybyte2022;

public class AddBinary {
    //given two binary strings, add both and return binary sum
    //eg "100" + "1", return "101"
    //"11" + "1", return "100"
    //"1" + "0", return  "1"

    public static void main(String[] args) {
        System.out.println(solve("100","1"));
        System.out.println(solve("11","1"));
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
                sum += a.charAt(i--);
            if(j >= 0)
                sum += b.charAt(j--);
            sum = (sum + carry) % 2;
            carry = sum / 2;
            result.append(sum);
        }
        if (carry > 0)
            result.append(carry);
        return result.reverse().toString();
    }
}
