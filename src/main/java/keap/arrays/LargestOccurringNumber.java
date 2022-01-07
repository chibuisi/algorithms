package keap.arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestOccurringNumber {
    public static int solution1(int [] nums){
        Map<Integer, Integer> counts = new HashMap<>();
        int largest = 0;
        for(int i : nums){
            counts.put(i, counts.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : counts.entrySet()){
            if(entry.getValue() > largest)
                largest = entry.getKey();
        }
        return largest;
    }

    public static void main(String[] args) {
        int [] nums = {2,3,2,1,3,4,5,3,2,2,4,6,7,5,6,4,3,334,4,5,3,2,4};
        System.out.println(solution1(nums));
        System.out.println(solution2(nums));
        System.out.println(solution3(nums));
    }

    public static int solution2(int [] nums){
        Map<Integer, Integer> counts = new HashMap<>();
        for(int i : nums){
            counts.put(i, counts.getOrDefault(i,0)+1);
        }
        int largestCount = 0;
        int smallerKey = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            if(entry.getValue() > largestCount) {
                largestCount = entry.getValue();
                smallerKey = entry.getKey();
            }
            if(largestCount == entry.getValue())
                smallerKey = Integer.min(smallerKey, entry.getKey());
        }
        return smallerKey;
    }

    public static int solution3(int [] nums){
        Map<Integer, Integer> counts = new HashMap<>();
        int largestCount = 0;
        int smallerKey = 0;
        for(int i : nums){
            counts.put(i, counts.getOrDefault(i,0)+1);
            if(counts.get(i) > largestCount){
                largestCount = counts.get(i);
                smallerKey = i;
            }
            if(counts.get(i) == largestCount)
                smallerKey = Integer.min(smallerKey, i);
        }
        return smallerKey;
    }
}
