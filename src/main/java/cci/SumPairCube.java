package cci;

import java.util.*;

public class SumPairCube {
    public static void main(String[] args) {
        printAllCubePair();
    }
    public static void printAllCubePair(){
        Map<Integer, List<Integer>> pairs = new HashMap<>();
        for(int c =0; c < 1000; c++){
            for(int d = 0; d < 1000; d++){
                List<Integer> newPair = new ArrayList<>(Arrays.asList(c,d));
                int sum =  (int) (Math.pow(c,3) + Math.pow(d,3));
                pairs.put(sum,newPair);
            }
        }
        for(int a = 0; a < 1000; a++){
            for(int b = 0; b < 1000; b++){
                int sum = (int) (Math.pow(a,3) + Math.pow(b,3));
                if(pairs.containsKey(sum)){
                    pairs.put(sum,new ArrayList<>(Arrays.asList(a,b)));
                }
            }
        }
        System.out.println(pairs);
    }
}