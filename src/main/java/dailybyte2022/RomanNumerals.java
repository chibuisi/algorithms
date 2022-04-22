package dailybyte2022;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public static int solution1(String str){
        int result = 0;
        if(str == null || str.length() == 0)
            return result;
        str = str.toLowerCase();
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('i',1);
        romans.put('v',5);
        romans.put('x',10);
        romans.put('l',50);
        romans.put('c',100);
        romans.put('d',500);
        romans.put('m',1000);

        for(int i = 0; i < str.length(); i++){
            int curr = romans.get(str.charAt(i));
            int next = 0;
            if(i+1 < str.length())
                next = romans.get(str.charAt(i+1));
            if(curr >= next)
                result += curr;
            else
                result += next - curr;
        }
        return result;
    }

    public static void main(String[] args) {
        String roman = "dclii";
        System.out.println(solution1(roman));
    }
}
