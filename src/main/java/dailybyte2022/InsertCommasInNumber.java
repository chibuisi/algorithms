package dailybyte2022;

public class InsertCommasInNumber {
    public static String solve(String number){
        StringBuilder result = new StringBuilder();
        int dotIndex = number.indexOf(".");
        String part = "";
        String whole = number;
        if(dotIndex > -1) {
            part = number.substring(number.indexOf("."));
            whole = number.substring(0, number.indexOf("."));
        }
        int j = 0;
        for(int i = whole.length()-1; i >= 0; i--){
            result.append(whole.charAt(i));
            j++;
            if(j % 3 == 0 && i != 0)
                result.append(",");
            //j++;
        }
        //result.append(part);
        return result.reverse().append(part).toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("23453245343.4"));
    }
}
