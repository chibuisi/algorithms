package geeks;

public class MultiplyTwoString {
    public static String solve(String s1, String s2){
        if(s1 == null && s2 == null || s1.length() == 0 && s2.length()== 0 || s1 == "0" || s2 == "0") return "0";
        if(s1 == null) return s2;
        if(s2 == null) return s1;

        StringBuilder res = new StringBuilder();
        if((s1.charAt(0) == '-' || s2.charAt(0) == '-')  && (s1.charAt(0) != '-' || s2.charAt(0) != '-'))
            res.append('-');

        if(s1.charAt(0) == '-')
            s1 = s1.substring(1);
        if(s2.charAt(0) == '-')
            s2 = s2.substring(1);

        int len1 = s1.length();
        int len2 = s2.length();
        int [] result = new int[len1 + len2];

        int index1 = 0;
        int index2 = 0;
        int carry = 0;

        for(int i = len1-1; i >= 0; i--){
            int n1 = s1.charAt(i) - '0';
            for(int j = len2-1; j >= 0; j--){
                int n2 = s2.charAt(j) -'0';
                int sum = n1 * n2 + result[index1 + index2] + carry;
                result[index1 + index2] = sum % 10;
                carry = sum / 10;
                index2 += 1;
            }
            if(carry > 0)
                result[index1 + index2] += carry;
            carry = 0;
            index2 = 0;
            index1 += 1;
        }
        int i = result.length-1;
        while(i >= 0 && result[i] == 0)
            i--;
        if(i < 0) return "0";

        while (i >= 0)
            res.append(result[i--]);

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("4416", "-333"));
    }
}
