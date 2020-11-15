package riotgames;

import java.util.function.BiFunction;
import java.util.function.Function;

public class CountBitsInNumber {
    public static void main(String[] args) {
        Function<Integer,Integer> function = (Integer n) -> {
          int count = 0;
          while (n > 0){
              n &= n - 1;
              count++;
          }
          return count;
        };

        BiFunction<Integer,Integer,Integer> repeatedAritmeticShift = (Integer x, Integer count) -> {
            for (int i = 0; i < count; i++){
                x >>= 1;
            }
            return x;
        };

        //System.out.println(function.apply(16));
        System.out.println(repeatedAritmeticShift.apply(-93242,40));
    }

}
