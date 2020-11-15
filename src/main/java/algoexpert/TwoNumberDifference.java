package algoexpert;

import java.util.*;

public class TwoNumberDifference {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2};
        int value = countPairOfDifferences(arr,1);
        System.out.println(value);
    }
    public static int countPairOfDifferences(int [] array, int k){
        List<Integer> numbers = new ArrayList<>();
        Map<Integer, HashSet<Integer[]>> nums = new HashMap<>();
        Map<Integer, List<List<Integer>>> sumsAndPairs = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < array.length; i++){
            nums.put(array[i],new HashSet<Integer[]>());
            //set.add(array[i]);
        }
        for(int num : array){
            int diff = num - k;
            if(nums.containsKey(diff)){
                nums.get(diff).add(new Integer[]{num,diff});
                count+= nums.get(diff).size();
            }
//            if(set.contains(diff)){
//                count++;
//            }
        }
        return count;
    }

    public static int countPairs(List<Integer> numbers, int k){
        Set<Integer> nums = new HashSet<>(numbers);
        int count = (int) numbers.stream().mapToInt(num -> k + num).filter(nums::contains).distinct().count();
        return count;
    }
}
