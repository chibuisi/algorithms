package algoexpert.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveElementToEnd {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2,1,2,2,2,3,4,2));
        List<Integer> res = moveElementToEnd(arr,2);
        res.forEach(System.out::println);
        int [][] arr1 = new int[][]{{1,2,3,4},{3,2,3,4}};
    }
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        //Collections.sort(array);
        int i = 0;
        int j = array.size()-1;
        while(i < j){
            while(array.get(j) == toMove && j > i){
                j--;
            }
            if(array.get(i) == toMove){
                swap(array,i,j);
            }
            i++;

        }
        return array;
    }

    private static void swap(List<Integer> array, int i, int j) {
        Integer tmp = array.get(i);
        array.set(i, array.get(j));
        array.set(j,tmp);
    }
}
