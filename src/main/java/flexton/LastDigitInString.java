package flexton;

public class LastDigitInString {
    public static void main(String[] args) {
        String str = "String01";
        System.out.println(lastDigit(str));
    }

    public static String lastDigit(String str){
        String res = "";
        if(Character.isDigit(str.charAt(str.length()-1))){
            int digit = str.charAt(str.length()-1) + 1;
            res = str.substring(0, str.length()-1);
            res += (char) digit;
        }
        return res;
    }
}
