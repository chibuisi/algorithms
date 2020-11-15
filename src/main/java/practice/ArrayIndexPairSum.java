package practice;

import java.util.*;

public class ArrayIndexPairSum {
    public static void main(String[] args) {
        int [] arr = {2,3,3,22,43,54,3,454,6,4,3};
        Map<Integer, List<List<Integer>>> sumsAndPairs = buildSumsAndPairs(arr);
        System.out.println(sumsAndPairs.values());
    }

    public static Map<Integer, List<List<Integer>>> buildSumsAndPairs(int[] arr) {
        Map<Integer, List<List<Integer>>> sumsAndPairs = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length-1;j++){
                int sum = arr[i] + arr[j];
                if(sumsAndPairs.containsKey(sum)){
                    List<Integer> newList = new ArrayList<Integer>(Arrays.asList(arr[i],arr[j]));
                    sumsAndPairs.get(sum).add(newList);
                }
                else {
                    sumsAndPairs.put(sum, new ArrayList<List<Integer>>());
                    sumsAndPairs.get(sum).add(new ArrayList<Integer>(Arrays.asList(arr[i],arr[j])));
                }
            }
        }
        return sumsAndPairs;
    }
}
