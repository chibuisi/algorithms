package msx;

import java.util.*;
import java.util.stream.Collectors;

public class CountingPairs {
    public static void main(String[] args) {
        int [] nums = {1,1,1,2};
        int k = 1;
        System.out.println(countPairs(nums,k));
    }
    public static int countPairs(int [] nums, int k){
        Map<Integer, HashSet<Integer[]>> uniquePairsAndDifferences = new HashMap<>();
        int count = 0;
        for(int i : nums) {
            uniquePairsAndDifferences.put(i, new HashSet<Integer[]>());
        }
        for(int i : nums){
            int diff = i - k;
            if(uniquePairsAndDifferences.containsKey(diff)) {
                uniquePairsAndDifferences.get(diff).add(new Integer[]{i, diff});
                count += uniquePairsAndDifferences.get(diff).size();
            }
        }
        return count;
    }
    public static int countPairs0(int [] nums, int k){
        int count = 0;
        Set<Integer> diff = new HashSet<>();
        for(int i : nums){
            if(diff.contains(i-k))
                count++;
            else diff.add(i-k);
        }
        return count;
    }
}
