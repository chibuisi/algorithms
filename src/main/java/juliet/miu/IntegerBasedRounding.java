package juliet.miu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerBasedRounding {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        doIntegerBasedRounding(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void doIntegerBasedRounding(int [] arr, int n){
        int index = 0;
        while(index < arr.length){
            int value = arr[index];
            int lowerbound = n;
            if(lowerbound + n >= value)
                lowerbound = 0;
            int upperBound = 0;
            while(upperBound < value)
                upperBound += n;

            int lowerDiff = Math.abs(value - lowerbound);
            int upperDiff = Math.abs(upperBound - value);
            if(upperDiff >= lowerDiff)
                arr[index] = upperBound;
            else
                arr[index] = lowerbound;
            index++;
        }
    }
    /*String S = "sams abbdd  SAM dd  sam..   jj   ..sam  be";
    List<String> res = Arrays.stream(S.split(" ")).filter(s -> s.equalsIgnoreCase("sams"))
            .map(s -> s = "walmart").collect(Collectors.toList());
        res.forEach(System.out::println);*/
}
