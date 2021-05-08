package amex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        testVarArg("Fire", "Love", null);
    }
    public static void testVarArg(String... data){
        String [] array = Stream.of(data).filter(s -> s != null).toArray(String[]::new);
        Stream.of(array).forEach(System.out::println);
    }
    public static void testFilterNull(){
        List<Integer> myList = Arrays.asList(1,null,2,3,4,null);

        Stream<Integer> validV = myList.stream().filter(i -> i != null).filter(i -> i > 3);
        //int sum = validV.mapToInt(integer -> integer).sum();
        int sum2 = validV.reduce(0, (a,b) -> a+b);

        System.out.println(sum2);
    }
}
