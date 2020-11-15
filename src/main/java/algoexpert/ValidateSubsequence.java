package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ValidateSubsequence {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(8, 3, 23, 27, 5, 0, 9, 11));
        List<Integer> sequence = new ArrayList<>(Arrays.asList(3, 5, 0, 11,2));
        System.out.println(isValidSubsequence(array,sequence));;
    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        ListIterator<Integer> arrIterator = array.listIterator();
        int i=0;
        while(arrIterator.hasNext() && sequence.size() >= i){
            if (sequence.get(i) == arrIterator.next()){
                i++;
            }
        }
        return sequence.size() == i;
    }
}
