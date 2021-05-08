package algoexpert;

import java.util.*;

public class TwoNumberDifference {
    public static void main(String[] args) {
        int [] arr = {1,1,1,2};
        int value = countPairOfDifferences(arr,1);
        System.out.println(value);
        System.out.println(countPairs(new ArrayList<>(Arrays.asList(1,1,1,2)),1));
    }
    public static int countPairOfDifferences(int [] array, int k){
        Map<Integer, HashSet<Integer[]>> nums = new HashMap<>();
        int count = 0;
        for(int i : array){
            nums.put(i,new HashSet<Integer[]>());
        }
        for(int num : array){
            int diff = num - k;
            if(nums.containsKey(diff)){
                nums.get(diff).add(new Integer[]{num,diff});
                count+= nums.get(diff).size();
            }
        }
        return count;
    }

    public static int countPairs(List<Integer> numbers, int k){
        Set<Integer> nums = new HashSet<>(numbers);
        int count = (int) numbers.stream().mapToInt(num -> k + num).filter(nums::contains).distinct().count();
        return count;
    }
}
