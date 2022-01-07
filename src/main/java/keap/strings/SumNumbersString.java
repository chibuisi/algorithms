package keap.strings;

public class SumNumbersString {
    public static int solution1(String str){
        int sum = 0;
        String temp = "0";
        for(char c : str.toCharArray()){
            if(Character.isDigit(c))
                temp += c;
            else{
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        System.out.println(solution1("1abc23ml90"));
    }
}
