package altemetriks.riot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargeFactorial {
    public static void main(String[] args) {
        long [] arr = {1,200,3,4,5};
        System.out.println(Arrays.toString(solutionTwo(arr)));
    }
    public static long[] solutionOne(long [] array){
        for(int i = 0; i < array.length; i++){
            long item = array[i];
            array[i] = fact(item);
        }
        return array;
    }

    private static long fact(long item) {
        if(item <= 1)
            return 1;
        return (item * fact(item - 1))  % (long) (Math.pow(10,9)+7);
    }
    private static long fact2(long num){
        Map<Integer, Long> facts = new HashMap<>();
        facts.put(0,1L);
        facts.put(1,1L);
        for(int i = 2; i <= num; i++){
            facts.put(i, i * facts.get(i-1));
        }
        return facts.get(facts.size()-1);
    }

    public static long [] solutionTwo(long [] array){
        Map<Integer, Long> facts = new HashMap<>();
        facts.put(0,1L);
        facts.put(1,1L);
        for(int i = 2; i < 10000; i++){
            facts.put(i, (i * facts.get(i - 1))  % (long) (Math.pow(10,9)+7));
        }
        for(int i = 0; i < array.length; i++){
            array[i] = facts.get((int)array[i]);
        }
        return array;
    }
}
