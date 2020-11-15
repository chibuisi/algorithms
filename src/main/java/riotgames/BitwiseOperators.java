package riotgames;

import java.util.function.BiFunction;

public class BitwiseOperators {
    public static void main(String[] args) {
        //System.out.println(13^5);
        //System.out.println(0|0);


        BiFunction<Integer,Integer,Integer> repeatedAritmeticShift = (Integer x, Integer count) -> {
            for (int i = 0; i < count; i++){
                x >>>= 1;
            }
            return x;
        };

        BiFunction<Integer, Integer, Integer> repeatedLogicalShift = (Integer x, Integer count) -> {
            for(int i = 0; i < count; i++){
                x >>= 1;
            }
            return x;
        };



        //System.out.println(repeatedAritmeticShift.apply(13,2));
        //System.out.println(repeatedLogicalShift.apply(1,1));
        System.out.println(shiftBits(1,5));
    }

    public static int shiftBits(int num, int count){
        for (int i = 0; i < count; i++){
            num <<= 1;
        }
        return num;
    }
}
