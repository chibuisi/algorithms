package altemetriks.riot;

import java.util.HashMap;
import java.util.Map;

/*
    Edge case
    1. Numerator should not be zero
    2. Stack overflow as a result of integer division
    3. Negative numbers;
     -  -
     -  +
 */
public class FractionToRecurringDecimal {
    public static void main(String[] args) {
        System.out.println(solutionOne(1,3));
    }
    public static String solutionOne(int numerator, int denominator){
        if(numerator == 0)
            return "0";
        StringBuilder result = new StringBuilder();
        result.append(((numerator < 0) ^ (denominator < 0)) ? "-" : "");
        long numer = (long) Math.abs(numerator); //take care of stack overflow and -ve nos
        long denom = (long) Math.abs(denominator);
        result.append(numer/denom);//4/8=0
        //numer = numer % denom
        //long rem = numer
        //8%4=0
        long remainder = numer % denom;
        if(remainder == 0)
            return result.toString();
        //0 rem 4
        //result = 0.
        result.append("."); // fractional part
        Map<Long, Integer> remainders = new HashMap<>();
        remainders.put(remainder, result.length());//[(4,2)]
        while(remainder > 0){
            remainder *= 10;//4*10=40
            result.append(remainder / denom);//40/8=5, res = 0.5
            remainder %= denom;//40%8=0
            if(remainders.containsKey(remainder)){
                int index = remainders.get(remainder);
                result.insert(index, "(");
                result.append(")");
                return result.toString();
            }
            else{
                remainders.put(remainder, result.length());//[(4,2), (0,3)]
            }

        }
        return result.toString();
    }
}
