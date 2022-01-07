package dailychallenge;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralToInteger {
    //if curr > next, add curr otherwise add (next - curr)
    public static int solve(String roman){
        Map<Character, Integer> romanValue = new HashMap<>();
        romanValue.put('i', 1);
        romanValue.put('v', 5);
        romanValue.put('x', 10);
        romanValue.put('l', 50);
        romanValue.put('c', 100);
        romanValue.put('d', 500);
        romanValue.put('m', 1000);
        roman = roman.toLowerCase();

        int result = 0;
        for(int i = 0; i < roman.length(); i++){
            int currValue = romanValue.get(roman.charAt(i));
            int nextValue = i+1 < roman.length() ? romanValue.get(roman.charAt(i+1)) : 0;

            if(currValue >= nextValue)
                result += currValue;
            else
                result += nextValue - currValue;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solve("dxxxiii"));
    }
}

//cd
