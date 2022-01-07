package geeks;

public class SumTwoStrings {
    public static String solve(String s1, String s2){
        if(s1 == null || s2 == null) return "0";
        if(s1.length() > s2.length()){
            String s = s2;
            s2 = s1;
            s1 = s;
        }
        int len1 = s1.length();
        int len2 = s2.length();
        int diff = len2 - len1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for(int i = len1-1; i >= 0; i--){
            int n1 = s1.charAt(i) - '0';
            int n2 = s2.charAt(i + diff) - '0';
            int sum = n1 + n2 + carry;
            result.append(sum%10 + '0');
            carry = sum / 10;
        }
        for(int i = len2 - len1 - 1; i >= 0; i--){
            int sum = (s2.charAt(i) - '0') + carry;
            carry = sum / 10;
            result.append(sum%10 + '0');
        }
        if(carry > 0)
            result.append(carry);
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("3", "4"));
    }
}
